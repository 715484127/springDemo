package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangyuepeng
 */
@Configuration
@ComponentScan("com.demo")
@EnableAspectJAutoProxy
public class SpringConfig {
}
