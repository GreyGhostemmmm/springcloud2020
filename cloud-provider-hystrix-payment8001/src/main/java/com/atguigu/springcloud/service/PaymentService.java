package com.atguigu.springcloud.service;

/**
 * @author Administrator
 * @date 2020/11/10 15:58
 */

public interface PaymentService {

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);
}
