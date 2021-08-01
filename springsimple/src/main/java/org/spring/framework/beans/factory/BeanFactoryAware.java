package org.spring.framework.beans.factory;

import org.spring.framework.beans.BeansException;

/**
 * @Author victor
 * @Description 能感知所属BeanFactory
 * @Date 2021-08-01 14:46
 * @Version 1.0
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
