package com.chongan.reflect;

import java.lang.reflect.Proxy;

public class AOPProxy {
    public static Object gerProxy(Object obj, AOPMethod method) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new AOPHandle(obj, method));
    }
}
