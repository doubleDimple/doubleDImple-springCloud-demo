package com.doubleDimple.orderServer.feign.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;

// 此处配置@Configuration注解就会全局生效，如果想指定对应微服务生效，就不 能配置
//https://blog.csdn.net/temp_44/article/details/123406152?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_baidulandingword~default-0-123406152-blog-80231049.pc_relevant_aa&spm=1001.2101.3001.4242.1&utm_relevant_index=3
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
        //NONE【性能最佳，适用于生产】：不记录任何日志（默认值）。
        //BASIC【适用于生产环境追踪问题】：仅记录请求方法、URL、响应状态代码以及 执行时间
        //HEADERS：记录BASIC级别的基础上，记录请求和响应的header。
        //FULL【比较适用于开发及测试环境定位问题】：记录请求和响应的header、body 和元数据
    }

    //配置拦截器
    @Bean
    public FeignAuthRequestInterceptor interceptor(){
        return new FeignAuthRequestInterceptor();
    }


    /**
     * 配置超时时间
     * 通过 Options 可以配置连接超时时间和读取超时时间，Options 的第一个参数是连接的超时 时间（ms），默认值是 2s；第二个是请求处理的超时时间（ms），默认值是 5s
     * @return
     */
    @Bean
    public Request.Options options(){
        return new Request.Options(500,700);
    }
}
