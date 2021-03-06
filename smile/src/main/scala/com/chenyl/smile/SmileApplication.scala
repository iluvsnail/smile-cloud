package com.chenyl.smile

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.scheduling.annotation.EnableScheduling

/**
  * User: chenyl 
  * Date: 2017-07-26  14:19 
  */
@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = Array("com.chenyl.smile"))
@EnableScheduling
class SmileApplication{

}
object SmileApplication {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[SmileApplication])
  }
}
