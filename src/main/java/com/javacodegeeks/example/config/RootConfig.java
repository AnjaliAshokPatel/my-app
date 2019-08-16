package com.javacodegeeks.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.javacodegeeks.example.*" })
public class RootConfig {
}