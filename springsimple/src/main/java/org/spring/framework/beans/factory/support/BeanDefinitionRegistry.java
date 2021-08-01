package org.spring.framework.beans.factory.support;

import org.spring.framework.beans.BeansException;
import org.spring.framework.beans.factory.config.BeanDefinition;

/**
 * @Author victor
 * @Description BeanDefinition注册接口
 * @Date 2021-08-01 17:11
 * @Version 1.0
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注BeanDefinition
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);

    /**
     * 根据名称获取bean
     * @param name
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String name) throws BeansException;

    /**
     * 是否包含指定的beanDefinition
     * @param name
     * @return
     */
    boolean containsBeanDefinition(String name);


    /**
     * 获取所有bean的名称
     * @return
     */
    String[] getBeanDefinitionNames();

}
