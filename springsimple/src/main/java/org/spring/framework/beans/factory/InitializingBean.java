package org.spring.framework.beans.factory;

/**
 * @Author victor
 * @Description 初始化bean
 * @Date 2021-08-01 14:48
 * @Version 1.0
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
