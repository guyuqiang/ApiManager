package cn.scmy.util;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Auther: guyuqiang  <br/>
 * Date: 2020/12/4:15:54  <br/>
 * Description:
 */
public class CustomDateConvert implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
