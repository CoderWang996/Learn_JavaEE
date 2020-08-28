package com.itheima.service.impl;

import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional    //默认事务
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
//    @Transactional
    public void transfer(String sname, String tname, Double money) {
        accountMapper.inUpdate(sname,money);
//        int a=1/0;
        accountMapper.outUpdate(tname,money);
    }
//    @Transactional(readOnly = false)
    public void outUpdate(String tname, Double money) {
        accountMapper.outUpdate(tname,money);
    }
}
