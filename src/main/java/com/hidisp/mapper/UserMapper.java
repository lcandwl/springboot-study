package com.hidisp.mapper;

import com.hidisp.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author yp
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-09-01 13:49:35
* @Entity com.hidisp.entity.User
*/
public interface UserMapper extends BaseMapper<User> {


}
