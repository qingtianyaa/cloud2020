package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOK(Integer id) {
        return "-----------PaymentFallbackService fall back-paymentInfo_OK,/(ćoć)/~~";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----------PaymentFallbackService fall back-paymentInfoTimeOut,/(ćoć)/~~";
    }
}
