package com.comenie.design.pattern.creational.singleton;

/**
 * Created by comeNie on 16/5/11.
 */
public class DCLSingleton {

    private  volatile  static  DCLSingleton singleton = null;

    private DCLSingleton(){

    }

    public  static  DCLSingleton getInstance(){
        if(null == singleton){
            synchronized (DCLSingleton.class){
                if(null == singleton){
                    singleton = new DCLSingleton();
                }
            }
        }
        return  singleton;
    }

    public static DCLSingleton getInstance2() {
        //local variable increases performance by 25 percent
        //Joshua Bloch "Effective Java, Second Edition", p. 283-284
        DCLSingleton result = singleton;
        if (result == null) {
            synchronized (DCLSingleton.class) {
                result = singleton;
                if (result == null) {
                    singleton = result = new DCLSingleton();
                }
            }
        }
        return result;
    }
}
