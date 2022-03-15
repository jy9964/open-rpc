package com.yy.rpc.core.discovery;

import com.yy.rpc.core.common.ServiceInfo;

/**
 * @Classname DiscoveryService
 * @Description
 * @Date 2021/7/23 18:28
 * @Created by jy
 */
public interface DiscoveryService {

    /**
     *  发现
     * @param serviceName
     * @return
     * @throws Exception
     */
    ServiceInfo discovery(String serviceName) throws Exception;

}
