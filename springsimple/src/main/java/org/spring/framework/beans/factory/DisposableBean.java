package org.spring.framework.beans.factory;

/**
 * @Author victor
 * @Description 销毁实例
 * @Date 2021-07-31 17:09
 * @Version 1.0
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
