package org.spring.framework.beans.factory.config;

import org.spring.framework.beans.BeansException;

/**
 * @Author victor
 * @Description 用于修改实例化后的bean的修改扩展点
 * @Date 2021-08-07 15:45
 * @Version 1.0
 */
public interface BeanPostProcessor {

    /**
     * 在bean执行初始化方法之前执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;


    /**
     * 在bean执行初始化方法之前执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
