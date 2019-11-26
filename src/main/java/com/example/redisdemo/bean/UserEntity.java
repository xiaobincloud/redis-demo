package com.example.redisdemo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * @program: redis-demo
 * @description: 用户实体
 * @author: xiaobin
 * @create: 2019-11-25 15:54
 **/
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserEntity implements Serializable {

    private Integer id;

    private String userName;

    private Integer age;

    private Date createTime;

    public UserEntity(Integer id, String userName, Integer age, Date createTime) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.createTime = createTime;
    }
}
