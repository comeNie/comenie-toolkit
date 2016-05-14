package com.comenie.design.pattern.creational.singleton;

/**
 * Created by comeNie on 16/5/11.
 */
public class HungrySingleton {

    private  final  static  HungrySingleton singleton = new HungrySingleton();

    private  HungrySingleton(){

    }

    public static HungrySingleton getInstace() {
        return singleton;
    }
}
