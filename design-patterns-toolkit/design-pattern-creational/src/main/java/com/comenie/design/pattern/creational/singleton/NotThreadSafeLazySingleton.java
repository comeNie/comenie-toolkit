package com.comenie.design.pattern.creational.singleton;

/**
 * Created by comeNie on 16/5/11.
 */
public class NotThreadSafeLazySingleton {

    private  static NotThreadSafeLazySingleton singleton = null;

    private NotThreadSafeLazySingleton(){};

    public   static NotThreadSafeLazySingleton getInstance(){
        if(null == singleton){
            singleton = new NotThreadSafeLazySingleton();
        }
        return  singleton;
    }
}
