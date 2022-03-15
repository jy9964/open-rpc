package com.yy.rpc.core.common;

/**
 * @Classname ServiceUtil
 * @Description
 * @Date 2021/7/23 17:52
 * @Created by jy
 */
public class ServiceUtil {

    /**
     *
     * @param serviceName
     * @param version
     * @return
     */
    public static String serviceKey(String serviceName, String version) {
        return String.join("-", serviceName, version);
    }

}
