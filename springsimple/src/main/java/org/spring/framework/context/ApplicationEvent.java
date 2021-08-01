package org.spring.framework.context;

import java.util.EventObject;

/**
 * @Author victor
 * @Description 应用事件
 * @Date 2021-07-31 21:43
 * @Version 1.0
 */
public abstract class ApplicationEvent extends EventObject {

    public ApplicationEvent(Object source) {
        super(source);
    }

}
