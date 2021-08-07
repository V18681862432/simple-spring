package org.spring.framework.beans.factory.config;

import org.spring.framework.beans.BeansException;

/**
 * @Author victor
 * @Description 自定义修改BeanDefinition的属性值
 * @Date 2021-08-07 14:58
 * @Version 1.0
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
