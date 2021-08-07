package org.spring.framework.core.convert;

/**
 * @Author victor
 * @Description 类型转换抽象接口
 * @Date 2021-08-07 23:16
 * @Version 1.0
 */
public interface ConversionService {

    boolean canConvert(Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<?> targetType);

}
