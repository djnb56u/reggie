package com.jingchua.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jingchua.reggie.entity.AddressBook;
import com.jingchua.reggie.mapper.AddressBookMapper;
import com.jingchua.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
