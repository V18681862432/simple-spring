package org.spring.framework.beans.factory.config;

import org.spring.framework.beans.BeansException;
import org.spring.framework.beans.factory.BeanFactory;

/**
 * @Author victor
 * @Description TODO
 * @Date 2021-08-07 15:11
 * @Version 1.0
 */
public interface AutowireCapableBeanFactory extends BeanFactory {


    /**
     * 执行BeanPostProcessors的postProcessBeforeInitialization方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName)
            throws BeansException;


    /**
     * 执行BeanPostProcessors的postProcessAfterInitialization方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName)
            throws BeansException;

}
