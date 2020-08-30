package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

//自定义类型转换
public class StringToDate implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat sf=simpleDateFormat(source);
        Date date =null;
        try {
            date = sf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public SimpleDateFormat simpleDateFormat(String source){
        SimpleDateFormat sdf = new SimpleDateFormat();
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) { // yyyy-MM-dd
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}-\\d{2}-\\d{2}$", source)) { // yyyy-MM-dd HH-mm-ss
            sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        } else if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$", source)) { // yyyy-MM-dd HH:mm:ss
            sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) { // yyyy/MM/dd
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        } else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2} \\d{2}/\\d{2}/\\d{2}$", source)) { // yyyy/MM/dd HH/mm/ss
            sdf = new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
        }else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$", source)) { // yyyy/MM/dd HH:mm:ss
            sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        }  else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) { // yyyyMMdd
            sdf = new SimpleDateFormat("yyyyMMdd");
        }  else if (Pattern.matches("^\\d{4}\\d{2}\\d{2} \\d{2}\\d{2}\\d{2}$", source)) { // yyyyMMdd HHmmss
            sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
        } else if (Pattern.matches("^\\d{4}\\.\\d{2}\\.\\d{2}$", source)) { // yyyy.MM.dd
            sdf = new SimpleDateFormat("yyyy.MM.dd");
        }  else if (Pattern.matches("^\\d{4}\\.\\d{2}\\.\\d{2} \\d{2}\\.\\d{2}\\.\\d{2}$", source)) { // yyyy.MM.dd HH.mm.ss
            sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
        }else{
            System.out.println("TypeMismatchException");
            throw new RuntimeException();
        }
        return sdf;
    }
}
