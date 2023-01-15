package com.jingchua.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jingchua.reggie.entity.OrderDetail;
import com.jingchua.reggie.mapper.OrderDetailMapper;
import com.jingchua.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}