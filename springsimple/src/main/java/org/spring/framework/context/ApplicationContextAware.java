package org.spring.framework.context;

import org.spring.framework.beans.BeansException;
import org.spring.framework.beans.factory.Aware;

/**
 * @Author victor
 * @Description 实现该接口，能感知所属ApplicationContext
 * @Date 2021-08-01 14:37
 * @Version 1.0
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext() throws BeansException;
}
