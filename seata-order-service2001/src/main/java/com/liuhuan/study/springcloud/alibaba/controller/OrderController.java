package com.liuhuan.study.springcloud.alibaba.controller;

import com.liuhuan.study.springcloud.alibaba.domain.CommonResult;
import com.liuhuan.study.springcloud.alibaba.domain.Order;
import com.liuhuan.study.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LiuHuan
 * @create 2020-02-26 15:24
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
