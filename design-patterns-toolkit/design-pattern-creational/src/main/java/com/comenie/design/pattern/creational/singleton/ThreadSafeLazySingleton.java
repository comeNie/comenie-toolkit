package com.comenie.design.pattern.creational.singleton;

/**
 * Created by comeNie on 16/5/11.
 */
public class ThreadSafeLazySingleton {

    private static ThreadSafeLazySingleton singleton = null;

    private ThreadSafeLazySingleton(){

    }

    public static synchronized ThreadSafeLazySingleton getInstance(){
        if (null != singleton){
            singleton = new ThreadSafeLazySingleton();
        }
        return  singleton;
    }
}
