package org.spring.framework.core.convert.support;

import org.spring.framework.core.convert.ConversionService;

/**
 * @Author victor
 * @Description TODO
 * @Date 2021-08-07 23:18
 * @Version 1.0
 */
public class DefaultConversionService implements ConversionService {
    @Override
    public boolean canConvert(Class<?> sourceType, Class<?> targetType) {
        return false;
    }

    @Override
    public <T> T convert(Object source, Class<?> targetType) {
        return null;
    }
}
