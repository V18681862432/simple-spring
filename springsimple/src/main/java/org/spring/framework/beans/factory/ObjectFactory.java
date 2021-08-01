package org.spring.framework.beans.factory;

import org.spring.framework.beans.BeansException;

/**
 * @Author victor
 * @Description TODO
 * @Date 2021-07-31 21:33
 * @Version 1.0
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
