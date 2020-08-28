package com.itheima.Test;

import com.itheima.service.AccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class Test {
    @Autowired
    private AccountService accountService;
    @org.junit.Test
    public void transfer(){
        accountService.transfer("老王","老周",100d);
    }

    @org.junit.Test
    public void outUpdate(){
        accountService.outUpdate("老周",100d);
    }
}
