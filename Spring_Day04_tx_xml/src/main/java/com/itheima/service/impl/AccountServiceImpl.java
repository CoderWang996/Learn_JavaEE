package com.itheima.service.impl;

import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public void transfer(String sname, String tname, Double money) {
        accountMapper.inUpdate(sname,money);
//        int a=1/0;
        accountMapper.outUpdate(tname,money);
    }

    public void outUpdate(String tname, Double money) {
        accountMapper.outUpdate(tname,money);
    }
}
