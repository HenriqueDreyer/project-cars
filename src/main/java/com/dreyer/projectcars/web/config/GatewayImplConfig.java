package com.dreyer.projectcars.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dreyer.projectcars.jpa.gatewayimpl")
public class GatewayImplConfig {
}
