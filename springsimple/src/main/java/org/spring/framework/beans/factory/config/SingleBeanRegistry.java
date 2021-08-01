package org.spring.framework.beans.factory.config;

/**
 * @Author victor
 * @Description 单例注册
 * @Date 2021-07-31 17:50
 * @Version 1.0
 */
public interface SingleBeanRegistry {

    /**
     * 根据名称获取单例
     * @param name
     * @return
     */
    Object getSingleton(String name);

    /**
     * 添加实例对象
     * @param singletonName
     * @param singletonObject
     */
    void addSingleton(String singletonName, Object singletonObject);

}
