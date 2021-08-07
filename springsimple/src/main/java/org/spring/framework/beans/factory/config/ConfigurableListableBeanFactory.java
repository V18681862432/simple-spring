package org.spring.framework.beans.factory.config;

import org.spring.framework.beans.BeansException;
import org.spring.framework.beans.factory.ListableBeanFactory;
import org.spring.framework.util.StringValueResolver;

/**
 * @Author victor
 * @Description TODO
 * @Date 2021-08-07 15:04
 * @Version 1.0
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory {

    /**
     * 根据名称查找BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 提前初始化所有单例实例
     * @throws BeansException
     */
    void preInstantiateSingletons() throws BeansException;

    /**
     * 添加修改扩展点bean实例
     * @param processor
     */
    void addBeanPostProcessor(BeanPostProcessor processor);

    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    String resolveEmbeddedValue(String value);

}
