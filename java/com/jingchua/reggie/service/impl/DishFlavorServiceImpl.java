package com.jingchua.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jingchua.reggie.entity.DishFlavor;
import com.jingchua.reggie.mapper.DishFlavorMapper;
import com.jingchua.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
