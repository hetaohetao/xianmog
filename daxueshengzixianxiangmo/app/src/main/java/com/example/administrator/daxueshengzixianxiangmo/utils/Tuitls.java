package com.example.administrator.daxueshengzixianxiangmo.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class Tuitls {
 private static    Class<?> aClass;
    private static    Type genericSuperclass;
    private static   Type[] arguments;
 private static Type type;
    public  static <T> T getT(Object o,int i){
         aClass = o.getClass();
         genericSuperclass = aClass.getGenericSuperclass();
        arguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
     type=arguments[i];
        try {
            aClass = o.getClass();
            genericSuperclass = aClass.getGenericSuperclass();
            arguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            type=arguments[i];
            return ((Class<T>)type).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
     return null;
    }
}
