package org.spring.framework.core.convert.converter;

/**
 * @Author victor
 * @Description 类型转换类接口
 * @Date 2021-08-07 23:22
 * @Version 1.0
 */
public interface Converter<S, T> {

    /**
     * 类型转换
     * @param source
     * @return
     */
    T convert(S source);
}
