package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/11/5 15:46
 */

public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
