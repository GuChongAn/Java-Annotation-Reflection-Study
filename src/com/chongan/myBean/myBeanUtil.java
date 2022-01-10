package com.chongan.myBean;

public class myBeanUtil {
    public static boolean check(Class myBeanClass) {
        return myBeanClass.isAnnotationPresent(myBean.class);
    }
}
