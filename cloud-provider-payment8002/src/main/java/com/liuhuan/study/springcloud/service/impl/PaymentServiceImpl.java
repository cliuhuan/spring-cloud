package com.liuhuan.study.springcloud.service.impl;

import com.liuhuan.study.springcloud.mapper.PaymentMapper;
import com.liuhuan.study.springcloud.entities.Payment;
import com.liuhuan.study.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LiuHuan
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
