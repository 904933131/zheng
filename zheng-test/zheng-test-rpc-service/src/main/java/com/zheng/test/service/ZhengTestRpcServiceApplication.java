package com.zheng.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZhengTestRpcServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZhengTestRpcServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> zheng-test-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        LOGGER.info(">>>>> zheng-test-rpc-service 启动完成 <<<<<");
    }

}
