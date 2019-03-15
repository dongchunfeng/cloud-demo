package com.itzixue.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Mr.Dong
 * @create 2019-03-15 13:35
 */
@FeignClient(value = "user-service",fallback = UserClientImpl.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    String queryUserById(@PathVariable("id") Long id);

}
