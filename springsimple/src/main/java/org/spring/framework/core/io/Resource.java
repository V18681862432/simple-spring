package org.spring.framework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author victor
 * @Description 资源访问接口
 * @Date 2021-08-01 20:25
 * @Version 1.0
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
