package com.chenyl.smile.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient


@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
class ConfigServerApplication {
}

object ConfigServerApplication{
	def main(args: Array[String]):Unit = {
		SpringApplication.run(classOf[ConfigServerApplication])
	}
}
