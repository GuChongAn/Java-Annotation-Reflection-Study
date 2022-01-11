package com.chongan.test;

import com.chongan.myBean.myBeanFactoryImpl;
import com.chongan.reflect.AOPMethod;
import com.chongan.reflect.AOPProxy;

public class myTest {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------Bean Test----------------");
        myBeanFactoryImpl myBeanFactory = new myBeanFactoryImpl();
        testClass testClass = (testClass) myBeanFactory.getBean(testClass.class);
        System.out.println(testClass.getTestPar());

        System.out.println("\n-------------AOP Test----------------");
        AOPTestClass aopTestClass = new AOPTestClass();
        AOPMethod aopMethod = new AOPMethodTestClass();
        AOPTestInterface aopTestInterface = (AOPTestInterface) AOPProxy.gerProxy(aopTestClass, aopMethod);
        aopTestInterface.myPrint();
    }
}
