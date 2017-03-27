package com.ysh.dubbox.provide.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:dubbox-provider.xml")
public class DubboConfig {

}
