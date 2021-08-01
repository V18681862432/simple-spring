package org.spring.framework.beans.factory.config;

/**
 * @Author victor
 * @Description 保存bean的信息，包括class、方法构造参数、bean属性、bean的scope等
 * @Date 2021-08-01 14:52
 * @Version 1.0
 */
public class BeanDefinition {

    public static final String SCOPE_SINGLETON = "singleton";

    public static final String SCOPE_PROTOTYPE = "prototype";

    private Class beanClass;

    private String initMethodName;

    private String destroyMethodName;


    private String scope = "singleton";

    private boolean singleton = true;

    private boolean prototype = false;

    public BeanDefinition(Class beanClass) {

    }


}
