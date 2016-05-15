---
title: 设计模式-创建型-单例模式
comments: true
date: 2016-05-15 21:49:12
tags: 
- 设计模式
- 单例模式 
categories: 设计模式
---
# 原理
单例型设计模式保障了对象创建的唯一性。这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象

注意：

* 1、单例类只能有一个实例。
* 2、单例类必须自己创建自己的唯一实例。
* 3、单例类必须给所有其他对象提供这一实例。

# 实现方式
* 饿汉式

```

public class HungrySingleton {

    private  final  static  HungrySingleton singleton = new HungrySingleton();

    private  HungrySingleton(){

    }

    public static HungrySingleton getInstace() {
        return singleton;
    }
}

```

* 懒汉式

```
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

```

* 改进型懒汉式（线程安全）

针对懒汉式的单例设计模式，其主要为非线程安全。可以采用同步加锁方式（synchronized，lock）等方式改进。

```
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


```

针对上面的synchronized方式，可以实现线程安全。锁的力度过粗。可以改进为(双重检查)：

```
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
```
*注：Joshua Bloch "Effective Java, Second Edition", p. 283-284，运用局部变量可更加提升效率*

* 枚举型

```

public enum EnumSingleton {
    INSTANCE;

    public  static void getInstance(){

    }
}

```

* 静态内部类

```

public class Singleton {

    private  static  class  SingletonHolder{
        public  final  static  Singleton singleton = new Singleton();
    }

    private  Singleton(){}

    public  static  Singleton getInstance(){
        return   SingletonHolder.singleton;
    }
}

```