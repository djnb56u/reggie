package com.jingchua.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jingchua.reggie.entity.User;
import com.jingchua.reggie.mapper.UserMapper;
import com.jingchua.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
