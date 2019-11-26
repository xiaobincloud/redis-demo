package com.example.redisdemo;

import com.alibaba.fastjson.JSON;
import com.example.redisdemo.bean.UserEntity;
import com.example.redisdemo.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;

import java.time.LocalDate;
import java.util.Date;

@Slf4j
@EnableCaching
@SpringBootTest
class RedisDemoApplicationTests {

    @Autowired
    private RedisUtil redisUtil;


    @Test
    void setRedis() {
        UserEntity userEntity = new UserEntity(1, "张三", 22, new Date());
        redisUtil.set("1", userEntity, 1000);
    }

    @Test
    void getRedis() {
        log.info(JSON.toJSONString(redisUtil.get("1")));
    }

    @Test
    void delRedis() {
        redisUtil.del("1");
    }
}
