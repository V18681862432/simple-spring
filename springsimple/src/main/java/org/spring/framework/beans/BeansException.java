package org.spring.framework.beans;


/**
 * @Author victor
 * @Description TODO
 * @Date 2021-07-31 21:35
 * @Version 1.0
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }


    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
