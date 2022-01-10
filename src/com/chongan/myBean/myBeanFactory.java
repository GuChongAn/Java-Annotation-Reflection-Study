package com.chongan.myBean;

import java.lang.reflect.InvocationTargetException;

public interface myBeanFactory {
    public Object getBean(Class beanClass) throws Exception;
}
