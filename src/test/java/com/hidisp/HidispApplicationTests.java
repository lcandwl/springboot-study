package com.hidisp;

import com.hidisp.entity.User;
import com.hidisp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.hidisp.mapper")
//如果注入失败  说明没有扫到这个包
class HidispApplicationTests {
    @Autowired
    private UserMapper mapper;
    Logger logger = LoggerFactory.getLogger(HidispApplicationTests.class);

    @Test
    void contextLoads() {
        List<User> list = mapper.selectList(null);
        list.forEach(System.out::println);
        logger.info("用户列表被打印出来了。。。");
    }

    @Test
    void context(){
        User user = new User();
        user.setUid(16);
        user.setUname("jacksongd");
        user.setUpwd("password");
        user.setBirthday("2017-07-01");
        user.setSex("male");
        user.setMarry(1);
        Integer one = mapper.insert(user);
        logger.info("insert successful"+one+"条数据!");
        mapper.selectList(null).forEach(System.out::println);

    }
}
