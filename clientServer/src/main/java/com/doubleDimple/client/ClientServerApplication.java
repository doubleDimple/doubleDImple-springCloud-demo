package com.doubleDimple.client;


import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ClientServerApplication implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientServerApplication.class);

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ClientServerApplication.class,args);
        LOGGER.info("ths client server start success.......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("ths port is [{}]",environment.getProperty("server.port"));
    }
}
