package com.comenit.design.pattern.other.callback;

import org.junit.Test;

/**
 * Created by comeNie on 16/5/5.
 */
public class CallBackTest {

    @Test
    public void testCallback(){
        Task task = new SimpleTask();
        task.excuteWithCallBack(new Callback() {
            public void call() {
                System.out.println("callback execute.");
            }
        });
    }
}
