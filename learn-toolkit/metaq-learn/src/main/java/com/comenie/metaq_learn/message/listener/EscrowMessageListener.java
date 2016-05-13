/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.metaq_learn.message.listener;

import com.comenie.metaq_learn.message.bean.EscrowMessageBean;
import com.taobao.metamorphosis.client.extension.spring.DefaultMessageListener;
import com.taobao.metamorphosis.client.extension.spring.MetaqMessage;

/**
 * @author: comNie
 * @since: 2016/5/13
 */
public class EscrowMessageListener extends DefaultMessageListener<EscrowMessageBean> {

    @Override
    public void onReceiveMessages(MetaqMessage<EscrowMessageBean> msg) {

    }
}
