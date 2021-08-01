package org.spring.framework.beans;

/**
 * @Author victor
 * @Description bean属性信息
 * @Date 2021-08-01 15:40
 * @Version 1.0
 */
public class PropertyValue {

    private final String name;

    private final Object value;


    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
