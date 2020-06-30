package com.liuhuan.study.springcloud.mapper;

import com.liuhuan.study.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author LiuHuan
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentMapper {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
