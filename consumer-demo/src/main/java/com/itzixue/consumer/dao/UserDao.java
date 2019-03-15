package com.itzixue.consumer.dao;

import com.itzixue.consumer.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mr.Dong
 * @create 2019-03-14 20:13
 */

@Component
@Slf4j
//@DefaultProperties(defaultFallback = "defaultFallBack")
public class UserDao {

    /*@Autowired
    private RestTemplate restTemplate;*/

   /* @Autowired
    private RibbonLoadBalancerClient client;*/

    /*public String queryUserById(Long id) {
        String baseUrl = "http://user-service/user/" + id;
        String user = this.restTemplate.getForObject(baseUrl, String.class);
        return user;
    }*/

    //@HystrixCommand(fallbackMethod = "queryUserByIdFallBack")
    /*@HystrixCommand(commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })*/
    /*@HystrixCommand(
            commandProperties = {
                    @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"), //触发次数
                    @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "10000"), //休眠时间 单位秒
                    @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60")  //预值百分比
            }
    )
    public String queryUserById(Long id) {
        // ServiceInstance instances = client.choose("user-service");
        // 获取ip和端口信息
        // String baseUrl = "http://"+instances.getHost() + ":" + instances.getPort()+"/user/" + id;
        //负载均衡算法  轮询  随机  hash
        //如果是偶数就触发熔断
        if(id %2 ==0){
            throw new RuntimeException("");
        }
        long begin = System.currentTimeMillis();
        String baseUrl = "http://user-service/user/" + id;
        String user = this.restTemplate.getForObject(baseUrl, String.class);
        long end = System.currentTimeMillis();
        log.info("访问用时: {}", end - begin);
        return user;
    }*/


    public User queryUserByIdFallBack(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户信息查询出现异常！");
        return user;
    }

    public String defaultFallBack() {
        return "用户信息查询出现异常！";
    }
}
