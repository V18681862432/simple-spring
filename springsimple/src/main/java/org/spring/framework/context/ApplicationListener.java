package org.spring.framework.context;

import java.util.EventListener;

/**
 * @Author victor
 * @Description 事件监听器
 * @Date 2021-08-01 14:22
 * @Version 1.0
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
