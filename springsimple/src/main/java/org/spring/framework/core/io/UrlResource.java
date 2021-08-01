package org.spring.framework.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author victor
 * @Description TODO
 * @Date 2021-08-01 21:18
 * @Version 1.0
 */
public class UrlResource implements Resource {

    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {

        URLConnection urlConnection = url.openConnection();
        try {
            return urlConnection.getInputStream();
        } catch (Exception e) {
            throw e;
        }
    }
}
