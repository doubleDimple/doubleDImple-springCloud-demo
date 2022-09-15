package com.doubleDimple.orderServer.feign.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * 配置feign拦截器
 */
public class FeignAuthRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        //TODO 业务逻辑
        requestTemplate.header("token","mytoken");
    }
}
