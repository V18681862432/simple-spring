package org.spring.framework.beans.factory.config;

import org.spring.framework.beans.PropertyValue;
import org.spring.framework.beans.PropertyValues;

import java.util.Objects;

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

    private PropertyValues propertyValues;


    public BeanDefinition (Class beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues == null ? new PropertyValues() : propertyValues;
    }

    public void setScope(String scope) {
        this.scope =  scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public boolean isSingleton() {
        return this.singleton;
    }

    public boolean isPrototype() {
        return this.prototype;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass())  return false;
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        return beanClass.equals(beanDefinition.beanClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beanClass);
    }
}
