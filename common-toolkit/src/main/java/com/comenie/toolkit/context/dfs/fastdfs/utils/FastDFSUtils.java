/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.context.dfs.fastdfs.utils;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerServer;

import java.util.HashMap;
import java.util.Map;

/**
 * FastDFS 工具类
 * @author: comNie
 * @since: 2016/2/22
 */
public class FastDFSUtils {

    /**
     * 创建存储服务器客户端
     *
     * @param trackerServer  跟踪服务器
     * @param storageServer  存储服务器
     * @return 存储服务器客户端
     */
    public static StorageClient1 newStorageClient1(TrackerServer trackerServer, StorageServer storageServer){
        return  new StorageClient1(trackerServer,storageServer);
    }

    /**
     * 创建存储服务器客户端
     * @param trackerServer 跟踪服务器
     * @param storageServer 存储服务器
     * @return 存储服务器客户端
     */
    public static StorageClient newStoreageClient(TrackerServer trackerServer, StorageServer storageServer){
        return  new StorageClient(trackerServer, storageServer);
    }


    /**
     * 转换Map类型的数据为NameValuePair数组
     * @param metaInformation Map类型的元数据信息。
     * @return NameValuePair  数组类型的元数据信息
     */
    public static NameValuePair[] newNameValuePairs(Map<String,String> metaInformation){
        if(null == metaInformation || metaInformation.isEmpty()){
            return null;
        }
        NameValuePair[] nameValuePairs = new NameValuePair[metaInformation.size()];
        {
            int index = 0;
            for (Map.Entry<String, String> entry : metaInformation.entrySet()) {
                nameValuePairs[index++]  = new NameValuePair(entry.getKey(),entry.getValue());
            }
        }
        return  nameValuePairs;
    }


    /**
     * 转换NameValuePair数组类型的数据为Map类型数据
     * @param nameValuePairs
     * @return Map类型的数据
     */
    public static Map<String,String> newMapFormNameValuePairs(NameValuePair[] nameValuePairs){
        Map<String,String> metaInformation  = new HashMap<String, String>();
        if(null != nameValuePairs && nameValuePairs.length > 0){
            for(NameValuePair entry : nameValuePairs){
                metaInformation.put(entry.getName(),entry.getValue());
            }
        }
        return  metaInformation;
    }
}
