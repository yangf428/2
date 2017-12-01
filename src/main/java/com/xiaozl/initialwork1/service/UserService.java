package com.xiaozl.initialwork1.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiaozl.initialwork1.entity.User;

/**
 * @author xiaozl
 * @date 2017/11/20
 */
public interface UserService {

    public void newUser(@Param("user") User user) throws Exception;

    public boolean checkLogin(User user) throws Exception;

    /*public List<User> listAllUsers() throws Exception;*/
    public List<User> listAllUsers() throws Exception;
}


/*业务层
在景区网站登录实例中，业务层仅有一个业务类，即UserService。
UserService负责将持久层的UserDao和LoginLoginDao组织起来完成用户/密码认证、登录日志记录等操作。*/