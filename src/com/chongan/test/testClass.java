package com.chongan.test;

import com.chongan.myBean.myBean;
import com.chongan.myBean.myValue;

@myBean
public class testClass {

    @myValue("Hello World")
    private String testPar;

    public void setTestPar(String testPar) {
        this.testPar = testPar;
    }

    public String getTestPar() {
        return testPar;
    }
}
