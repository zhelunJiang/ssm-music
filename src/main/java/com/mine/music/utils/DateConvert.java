package com.mine.music.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: DELL
 * Date: 2018/3/27
 * Time: 16:37
 * To change this template use File | Settings | File Templates.
 * 蒋string 转成date
 */

public class DateConvert implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        return null;

    }
}
