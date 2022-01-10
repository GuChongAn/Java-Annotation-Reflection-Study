package com.chongan.test;

import com.chongan.myBean.myBeanFactoryImpl;

public class myTest {
    public static void main(String[] args) throws Exception {
        myBeanFactoryImpl myBeanFactory = new myBeanFactoryImpl();
        testClass testClass = (testClass) myBeanFactory.getBean(testClass.class);
        System.out.println(testClass.getTestPar());
    }
}
