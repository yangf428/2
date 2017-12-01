package com.xiaozl.initialwork1.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiaozl.initialwork1.AbstractTestCase;
import com.xiaozl.initialwork1.entity.User;
import com.xiaozl.initialwork1.service.UserService;

import java.util.List;

/**
 * @author xiaozl
 * @date 2017/11/20
 */
public class UserServiceTest extends AbstractTestCase {
    @Autowired
    private UserService userService;

    @Test
    public void newUser() throws Exception {
        User user = new User();
        user.setUserName("xiaozlhh");
        user.setPassword("12345678");

        userService.newUser(user);

    }

    @Test
    public void listAllUsers() throws Exception {
        List<User> list = userService.listAllUsers();
        if (list == null || list.size() <= 0){
          return;
        }


        for (User user : list){
            System.out.println(user.getUserName());
        }

        for (User user:list){
            System.out.println(user.getId());
        }

       /* int num = 0;
        for (int i=0;i<=list.size();i++){
            num = i;
        }
        System.out.print(num);*/
    }
}
