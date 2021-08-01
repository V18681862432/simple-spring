package org.spring.framework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author victor
 * @Description TODO
 * @Date 2021-08-01 15:38
 * @Version 1.0
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue py) {
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue currentPy = this.propertyValueList.get(i);
            if (currentPy.getName().equals(py.getName())) {
                // 覆盖原有的属性值
                this.propertyValueList.set(i, py);
                return;
            }
        }
        this.propertyValueList.add(py);
    }

    public PropertyValue[] getPropertyValue() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {

        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue propertyValue = this.propertyValueList.get(i);
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }
}

