package org.spring.framework.core.io;


import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author victor
 * @Description 默认资源加载器
 * @Date 2021-08-01 20:46
 * @Version 1.0
 */
public class DefaultResourceLoader implements ResourceLoader {

    public static final String CLASSPATH_PREFIX = "classpath:";


    @Override
    public Resource getResource(String location) {
        if (location.startsWith(CLASSPATH_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_PREFIX.length()));
        } else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
        }
    }
}
