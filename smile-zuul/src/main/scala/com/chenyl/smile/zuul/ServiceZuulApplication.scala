package com.chenyl.smile.zuul

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
class ServiceZuulApplication {
}

object  ServiceZuulApplication{
    def main(args:Array[String]):Unit = {
        SpringApplication.run(classOf[ServiceZuulApplication])
    }
}