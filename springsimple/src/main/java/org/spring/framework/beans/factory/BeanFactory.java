package org.spring.framework.beans.factory;

/**
 * @Author Xiaoluo
 * @Description
 * @Date 2021-07-31 16:29
 * @Version 1.0
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param name
     * @return
     */
    Object getBean(String name);


    /**
     * 根据名称和类型查找bean
     * @param name
     * @param classType
     * @param <T>
     * @return
     */
    <T> T getBean(String name, Class<T> classType);


    /**
     * 根据类型查找bean
     * @param classType
     * @param <T>
     * @return
     */
    <T> T getBean(Class<T> classType);

    /**
     * 判断bean是否存在
     * @param name
     * @return
     */
    boolean containsBean(String name);
}
