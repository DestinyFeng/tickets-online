package com.woniu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Configuration
public class RedisTemplateConfig {
    @Resource
    private RedisTemplate redisTemplate;
    @Bean
    public RedisTemplate<String,Object> initRedisTemplate(){
        //修改键的序列化策略
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
