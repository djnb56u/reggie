package com.jingchua.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jingchua.reggie.entity.Employee;
import com.jingchua.reggie.mapper.EmployeeMapper;
import com.jingchua.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {
}
