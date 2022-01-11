package com.chongan.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AOPHandle implements InvocationHandler {
   private Object obj;
   private AOPMethod aopMethod;

   public AOPHandle(Object o, AOPMethod method) {
       this.obj = o;
       this.aopMethod = method;
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       aopMethod.before(proxy, method, args);
       Object result = method.invoke(obj, args);
       aopMethod.after(proxy, method, args);
       return result;
    }
}
