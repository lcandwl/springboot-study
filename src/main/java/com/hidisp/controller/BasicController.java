/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hidisp.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hidisp.entity.User;
import com.hidisp.service.UserService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class BasicController {

    @Resource
    private UserService service;

    // http://127.0.0.1:8080/hello?name=list
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name = "name", defaultValue = "monther fhcker") String name) {
        return "Hello " + name;
    }

    // http://127.0.0.1:8080/user
    @RequestMapping("/user")
    @ResponseBody
    public User user() {
        User user = new User();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = fmt.format(new Date());
        user.setBirthday(format);
        user.setUname("sjfdf");
        user.setUpwd("12345");
        user.setUid(1);


        return user;
    }

    @RequestMapping("/get")
    public ModelAndView getUsers() {
        ModelAndView view = new ModelAndView("index");
        return view.addObject("lists",service.selectList(new EntityWrapper<User>().eq("uid",33)));
    }
    // http://127.0.0.1:8080/save_user?name=newName&age=11
    @RequestMapping("/save_user")
    @ResponseBody
    public String saveUser(User u) {
        return "user will save: name=" + u.getUname() + ", age=" + u.getUpwd();
    }

    // http://127.0.0.1:8080/html
    @RequestMapping("/html")
    public String html() {
        return "index.html";
    }

    @ModelAttribute
    public void parseUser(@RequestParam(name = "name", defaultValue = "unknown user") String name
            , @RequestParam(name = "age", defaultValue = "12") Integer age, User user) {
        // user.setName("zhangsan");
        // user.setAge(18);
    }
}
