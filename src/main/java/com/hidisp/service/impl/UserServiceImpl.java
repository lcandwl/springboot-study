package com.hidisp.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hidisp.entity.User;
import com.hidisp.service.UserService;
import com.hidisp.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author yp
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-09-01 13:49:35
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
