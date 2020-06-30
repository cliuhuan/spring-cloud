package com.liuhuan.study.springcloud.service;

import com.liuhuan.study.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author LiuHuan
 * @create 2020-02-18 10:40
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
