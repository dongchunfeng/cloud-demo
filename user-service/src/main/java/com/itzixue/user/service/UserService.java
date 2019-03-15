package com.itzixue.user.service;

import com.itzixue.user.mapper.UserMapper;
import com.itzixue.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Mr.Dong
 * @create 2019-03-14 18:56
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        // 为了演示超时现象，我们在这里然线程休眠,时间2000毫秒
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return userMapper.selectByPrimaryKey(id);
    }

}
