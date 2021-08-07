package org.spring.framework.core.convert.converter;

/**
 * @Author victor
 * @Description 类型转换工厂
 * @Date 2021-08-07 23:24
 * @Version 1.0
 */
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
