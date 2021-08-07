package org.spring.framework.beans.factory;

import org.spring.framework.beans.BeansException;
import org.spring.framework.beans.PropertyValue;
import org.spring.framework.beans.PropertyValues;
import org.spring.framework.beans.factory.config.BeanDefinition;
import org.spring.framework.beans.factory.config.BeanFactoryPostProcessor;
import org.spring.framework.beans.factory.config.ConfigurableListableBeanFactory;
import org.spring.framework.util.StringValueResolver;

import java.util.Properties;

/**
 * @Author victor
 * @Description TODO
 * @Date 2021-08-07 16:27
 * @Version 1.0
 */
public class PropertyPlaceholderConfigurer implements BeanFactoryPostProcessor {


    public static final String PLACE_HOKDER_PREFIX = "${";

    public static final String PLACE_HOKDER_SUFFIX = "}";


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // 加载属性配置文件
        Properties properties = new Properties();

        // 属性值替换占位符
        processProperties(beanFactory, properties);

        StringValueResolver valueResolver = new PlaceholderResolvingStringValueResolver(properties);
        beanFactory.addEmbeddedValueResolver(valueResolver);

    }


    /**
     * 属性值替换站位符
     *
     * @param beanFactory
     * @param properties
     */
    private void processProperties(ConfigurableListableBeanFactory beanFactory, Properties properties) {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
            resolvePropertyValues(beanDefinition, properties);
        }
    }

    private void resolvePropertyValues(BeanDefinition beanDefinition, Properties properties) {
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues.getPropertyValue()) {
            Object value = propertyValue.getValue();
            if (value instanceof String) {
                value = resolvePlaceholder((String) value, properties);
                propertyValues.addPropertyValue(new PropertyValue(propertyValue.getName(), value));
            }
        }

    }

    private  String resolvePlaceholder(String value, Properties properties) {
            String str = value;
            // 线程安全
            StringBuffer stringBuffer = new StringBuffer(str);
            int startIndex = stringBuffer.indexOf(PLACE_HOKDER_PREFIX);
            int endIndex = stringBuffer.indexOf(PLACE_HOKDER_SUFFIX);

            if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
                String propKey = stringBuffer.substring(startIndex + 2, endIndex);
                String propertyValue = properties.getProperty(propKey);
                stringBuffer.replace(startIndex, endIndex + 1, propertyValue);
            }
            return stringBuffer.toString();


    }

    private class PlaceholderResolvingStringValueResolver implements StringValueResolver {
        private final Properties properties;

        public PlaceholderResolvingStringValueResolver(Properties properties) {
            this.properties = properties;
        }

        @Override
        public String resolveStringValue(String str) {
            return resolvePlaceholder(str, properties);
        }
    }

}

