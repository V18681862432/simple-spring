package org.spring.framework.core.convert.converter;

/**
 * @Author victor
 * @Description 类型转换器注册接口
 * @Date 2021-08-07 23:19
 * @Version 1.0
 */
public interface ConverterRegistry {

    void addConverter(Converter<?, ?> converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);

    void addConverter(GenericConverter converter);

}
