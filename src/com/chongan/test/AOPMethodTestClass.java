package com.chongan.test;

import com.chongan.reflect.AOPMethod;

import java.lang.reflect.Method;

public class AOPMethodTestClass implements AOPMethod {
    @Override
    public void after(Object proxy, Method method, Object[] args) {
        System.out.println("after:"+method.getName());
    }

    @Override
    public void before(Object proxy, Method method, Object[] args) {
        System.out.println("before:"+method.getName());
    }
}
