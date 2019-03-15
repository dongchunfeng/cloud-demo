package com.itzixue.consumer.web;

import com.itzixue.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Mr.Dong
 * @create 2019-03-14 19:07
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<String> consume(@RequestParam("ids") List<Long> ids){
        return userService.queryByIds(ids);
    }

}
