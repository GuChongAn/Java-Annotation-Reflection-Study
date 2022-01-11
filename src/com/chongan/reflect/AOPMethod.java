package com.chongan.reflect;

import java.lang.reflect.Method;

public interface AOPMethod {
    public void after(Object proxy, Method method, Object[] args);
    public void before(Object proxy, Method method, Object[] args);
}
