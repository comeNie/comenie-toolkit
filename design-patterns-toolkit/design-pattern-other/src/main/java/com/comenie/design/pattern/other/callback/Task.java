package com.comenie.design.pattern.other.callback;

/**
 * Created by comeNie on 16/5/5.
 */
public abstract class Task {


    public void excuteWithCallBack(Callback callBack){
        execute();
        if(null != callBack){
            callBack.call();
        }
    }

    public abstract void execute();
}
