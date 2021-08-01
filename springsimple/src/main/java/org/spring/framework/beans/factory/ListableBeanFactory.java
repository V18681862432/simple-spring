package org.spring.framework.beans.factory;

import java.util.Map;

/**
 * @Author victor
 * @Description 实例列表
 * @Date 2021-07-31 16:52
 * @Version 1.0
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 返回指定类型的所有实例
     * @param type
     * @param <T>
     * @return
     */
    <T> Map<String, T> getBeansOfType(Class<T> type);


    /**
     * 获取所有定义的bean名称
     * @return
     */
    String[] getBeanDefinitionNames();

}
