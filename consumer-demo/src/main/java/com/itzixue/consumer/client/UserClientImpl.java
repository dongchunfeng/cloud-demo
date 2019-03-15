package com.itzixue.consumer.client;

import org.springframework.stereotype.Component;

/**
 * @author Mr.Dong
 * @create 2019-03-15 13:58
 */
@Component
public class UserClientImpl implements UserClient {
    @Override
    public String queryUserById(Long id) {
        return "未知用户";
    }
}
