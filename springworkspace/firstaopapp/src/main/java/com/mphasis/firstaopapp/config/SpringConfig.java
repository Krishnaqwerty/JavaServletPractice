package com.mphasis.firstaopapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.mphasis.firstaopapp"})
@EnableAspectJAutoProxy
public class SpringConfig {

}
