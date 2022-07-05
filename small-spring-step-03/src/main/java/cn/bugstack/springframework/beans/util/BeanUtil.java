package cn.bugstack.springframework.beans.util;

import java.lang.reflect.Field;

public class BeanUtil {

    public static void setFieldValue(Object bean, String name, Object value){
        Class<?> calzz = bean.getClass();
        try {
            Field field = calzz.getDeclaredField(name);
            field.setAccessible(true);
            field.set(bean, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
