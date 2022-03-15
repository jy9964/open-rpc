package com.yy.rpc.consumer.loadbalance;

import com.yy.rpc.core.balancer.LoadBalance;
import com.yy.rpc.core.common.ServiceInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 自定义负载均衡策略
 * 取第一个
 * @Author: changjiu.wang
 * @Date: 2021/7/26 18:55
 */
@Slf4j
//@Component
public class FirstLoadBalance implements LoadBalance {

    @Override
    public ServiceInfo chooseOne(List<ServiceInfo> services) {
        log.info("---------FirstLoadBalance-----------------");
        return services.get(0);
    }
}
