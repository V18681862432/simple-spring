package org.spring.framework.beans.factory.support;

import org.spring.framework.beans.factory.DisposableBean;

/**
 * @Author victor
 * @Description bean销毁适配器
 * @Date 2021-07-31 17:11
 * @Version 1.0
 */
public class DisposableBeanAdapter implements DisposableBean {


    private final Object bean;

    private final Object beanName;

    private final String destroyMethodName;


    public DisposableBeanAdapter(Object bean, Object beanName, String destroyMethodName) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = destroyMethodName;
    }


    public void destroy() throws Exception {
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // TODO
    }
}
