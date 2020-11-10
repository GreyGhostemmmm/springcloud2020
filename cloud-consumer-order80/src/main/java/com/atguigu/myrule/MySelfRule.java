package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @date 2020/11/5 11:45
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }
}
