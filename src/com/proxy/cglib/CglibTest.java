package com.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

public class CglibTest {
    public static void main(String[] args) {
        DaoProxy daoProxy = new DaoProxy();
        DaoProxy2 daoProxy2 = new DaoProxy2();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
//        enhancer.setCallback(daoProxy);
        enhancer.setCallbacks(new Callback[]{daoProxy,daoProxy2});
        enhancer.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
                if (method.getName().equals("select")){
                    return 0;
                }
                else
                    return 1;
            }
        });

        Dao dao = (Dao) enhancer.create();
        dao.update();
        dao.select();
    }
}
