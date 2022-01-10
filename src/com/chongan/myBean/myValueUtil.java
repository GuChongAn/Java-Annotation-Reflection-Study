package com.chongan.myBean;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class myValueUtil {
    public static Object setValue(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field: fields) {
            if (field.isAnnotationPresent(myValue.class)) {
                Class fieldClass = field.getType();
                myValue myValue = field.getAnnotation(myValue.class);
                String value = myValue.value();
                if ("".equals(value))
                    value = null;
                String setMethodName = "set" + field.getName().substring(0,1).toUpperCase()
                        + field.getName().substring(1);
                obj.getClass().getMethod(setMethodName, fieldClass)
                        .invoke(obj, value);
            }
        }
        return obj;
    }
}
