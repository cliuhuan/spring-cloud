package com.liuhuan.study.springcloud.alibaba.service;

import com.liuhuan.study.springcloud.entities.CommonResult;
import com.liuhuan.study.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author LiuHuan
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
