package org.spring.framework.core.io;

/**
 * @Author victor
 * @Description 资源加载器
 * @Date 2021-08-01 20:24
 * @Version 1.0
 */
public interface ResourceLoader {

    Resource getResource(String location);
}
