package com.itzixue.consumer.service;

import com.itzixue.consumer.client.UserClient;
import com.itzixue.consumer.dao.UserDao;
import com.itzixue.consumer.pojo.User;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Dong
 * @create 2019-03-14 20:14
 */
@Service
public class UserService {

   /* @Autowired
    private UserDao userDao;*/
   @Autowired
   private UserClient userClient;

    public List<String> queryByIds(List<Long> ids) {
        List<String> list = new ArrayList<>();
        for (Long id : ids) {
            String user = userClient.queryUserById(id);
            list.add(user);
        }
        return list;
    }

}
