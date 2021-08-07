package org.spring.framework.beans.factory.config;

import org.spring.framework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author victor
 * @Description
 * @Date 2021-08-07 15:35
 * @Version 1.0
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingleBeanRegistry {

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);


    void destroySingletonBean();

    /**
     * 附加值
     */
    void addEmbeddedValueResolver();

}
