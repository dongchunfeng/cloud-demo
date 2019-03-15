package com.itzixue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * EnableDiscoveryClient   表明是一个eureka客户端
 * EnableCircuitBreaker   开启熔断器
 * @author Mr.Dong
 * @create 2019-03-14 19:06
 */
/*@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication*/
@EnableFeignClients
@SpringCloudApplication
public class ConsumerApplication {

    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        // 这次我们使用了OkHttp客户端,只需要注入工厂即可
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }

}
