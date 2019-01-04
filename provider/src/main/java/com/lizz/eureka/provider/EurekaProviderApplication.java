package com.lizz.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * EurekaProviderApp starter
 *
 * EnableEurekaClient Eureka注册
 * EnableDiscoveryClient Spring通用注册
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaProviderApplication.class, args);
        System.out.println("EurekaProviderApplication started");
    }
}
