package com.comenie.toolkit.context.dfs.fastdfs;

import com.comenie.toolkit.context.dfs.DistributedFileSystemException;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

/**
 * 存储服务器客户端回调。
 * 
 * @author Daniel Li
 * @since 19 Jun 2013
 *
 * @param <T> 回调返回值类型。
 */
public abstract class AbstractStorageClientReturnedCallback<T> implements StorageClientReturnedCallback<T>{

	public TrackerServer getTrackerServer(TrackerClient trackerClient) throws Exception {
		TrackerServer trackerServer = trackerClient.getConnection();
		if (trackerServer == null) {
			throw new DistributedFileSystemException("trackerClient.getConnection() return null, error code: " + trackerClient.getErrorCode());
		}
		return trackerServer;
	}
	
	public StorageServer getStorageServer(TrackerClient trackerClient, TrackerServer trackerServer) throws Exception {
		StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
		if (storageServer == null) {
			throw new DistributedFileSystemException("trackerClient.getStoreStorage(trackerServer) fail, error code: " + trackerClient.getErrorCode());
		}
		return storageServer;
	}
}
