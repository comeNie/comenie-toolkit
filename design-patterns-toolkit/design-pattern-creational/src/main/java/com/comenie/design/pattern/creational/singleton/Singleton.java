package com.comenie.design.pattern.creational.singleton;

/**
 * Created by comeNie on 16/5/11.
 */
public class Singleton {
    private  static  class  SingletonHolder{
        public  final  static  Singleton singleton = new Singleton();
    }

    private  Singleton(){

    }

    public  static  Singleton getInstance(){
        return   SingletonHolder.singleton;
    }
}
