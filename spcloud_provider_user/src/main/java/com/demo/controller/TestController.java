package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.demo.controller</p>
 * <p>ClassName:TestController</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2019/12/18
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
@RestController
@RequestMapping("user")
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping("getAll")
    public List<User> getAll(){

        return userService.getAll();
    }



}
