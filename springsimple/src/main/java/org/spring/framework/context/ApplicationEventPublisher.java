package org.spring.framework.context;

/**
 * @Author victor
 * @Description 事件发布接口
 * @Date 2021-07-31 22:02
 * @Version 1.0
 */
public interface ApplicationEventPublisher {

    /**
     * 事件发布
     * @param applicationEvent
     */
    void publishEvent(ApplicationEvent applicationEvent);

}
