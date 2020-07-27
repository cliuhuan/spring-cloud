# Spring-Cloud

### 介绍
SpringCloud各个组件详解，因为SpringCloud部分组件停止更新，故本项目包含原SpringCloud（基于SpringCloud H版和SpringBoot 2.X版）和SpringCloud Alibaba，[查看SpringCloud和SpringBoot官方推荐版本依赖](https://spring.io/projects/spring-cloud#overview)

### SpringCloud组件更新情况

| 作用 | 之前 | 之后 |
| :------: | :-----: | :------------------------------: |
| 服务注册 | Eureka | Zookeeper、Consul、Nacos（推荐） |
| 服务调用 | Ribbon | LoadBalancer |
| 服务调用 |  Feign | OpenFeign |
| 服务降级 | Hystrix | Resilience4j、Sentinel（推荐） |
| 服务网关 | Zuul | Zuul2、Gateway（推荐） |
| 服务配置 | Config | Apollo、Nacos（推荐） |
| 服务主线 | Bus | Nacos |

![输入图片说明](https://images.gitee.com/uploads/images/2020/0701/124951_dfaf2358_7531595.jpeg "SpringCloud_Module.jpg")

### 项目各模块概况
| 模块 | 功能 |
| :-----: | :-----: |
| cloud-provider-payment8001 | 微服务提供者集群 |
| cloud-provider-payment8002 | 微服务提供者集群 |
| cloud-consumer-order80 | 微服务消费者 |
| cloud-eureka-server7001 | Eureka集群 |
| cloud-eureka-server7002 | Eureka集群 |
| cloud-provider-payment8004 | 注册到Zookpper的服务提供者 |
| cloud-consumerzk-order80 | 注册到Zookpper的服务消费者 |
| cloud-providerconsul-payment8006 | 注册到Consul的服务提供者 |
| cloud-consumerconsul-order80 | 注册到Consul的服务消费者 |
| cloud-consumer-feign-order80 | 使用OpenFeign的服务消费者 |
| cloud-provider-hystrix-payment8001 | 使用Hystrix的服务提供者 |
| cloud-consumer-feign-hystrix-order80 | Hystrix整合Feign |
| cloud-consumer-hystrix-dashboard9001 | Hystrix监控 |
| cloud-gateway-gateway9527 | Gateway网关 |
| cloud-config-center-3344 | SpringCloud Config、Bus配置 |
| cloud-config-client-3355 | SpringCloud Config、Bus客户端集群 |
| cloud-config-client-3366 | SpringCloud Config、Bus客户端集群 |
| cloud-stream-rabbitmq-provider8801 | SpringCloud Stream消息驱动生产者 |
| cloud-stream-rabbitmq-consumer8802 | SpringCloud Stream消息驱动消费者 |
| cloud-stream-rabbitmq-consumer8803 | SpringCloud Stream消息驱动消费者 |
| cloudalibaba-provider-payment9001 | 注册Nacos服务提供者集群 |
| cloudalibaba-provider-payment9002 | 注册Nacos服务提供者集群 |
| cloudalibaba-provider-payment9003 | 注册Nacos服务提供者集群 |
| cloudalibaba-provider-payment9004 | 注册Nacos服务提供者集群 |
| cloudalibaba-consumer-nacos-order83 | 注册Nacos服务消费者 |
| cloudalibaba-config-nacos-client3377 | Nacos配置中心 |
| cloudalibaba-consumer-nacos-order84 | Sentinel整合Feign |
| cloudalibaba-sentinel-service8401 | Sentinel熔断限流 |
| seata-account-service2001 | 分布式事务Seata账户模块 |
| seata-storage-service2002 | 分布式事务Seata库存模块 |
| seata-order-service2003 | 分布式事务Seata订单模块 |
| spring-cloud-common | 公用模块 |

### 官网资料
SpringCloud Hoxton：<https://cloud.spring.io/spring-cloud-static/Hoxton.SR1/reference/htmlsingle/>
<br/>
SpringBoot 2.2.2：<https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/>
