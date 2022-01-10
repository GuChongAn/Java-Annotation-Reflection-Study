package com.chongan.myBean;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class myBeanFactoryImpl implements myBeanFactory{
    Map<String, Object> myBeanList = new HashMap<String, Object>();

    @Override
    public Object getBean(Class beanClass)
            throws Exception {
        // 如果没有@myBean注解，则警告
        if(!myBeanUtil.check(beanClass)) {
            System.err.println("[Warning] Not Found myBean Annotation");
            return null;
        }

        String beanName = beanClass.getName();
        // 如果myBean列表中没有请求的Bean，则新实例化一个并加入列表中
        if (myBeanList.get(beanName)==null) {
            // 实例化Bean对象，然后调用@myValue注解解释器，设置对象的属性
            Constructor constructor = beanClass.getConstructor();
            Object newBean = constructor.newInstance();
            newBean = myValueUtil.setValue(newBean);
            myBeanList.put(beanName, newBean);
        }
        return myBeanList.get(beanName);
    }
}
