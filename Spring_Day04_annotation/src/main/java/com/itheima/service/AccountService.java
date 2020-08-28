package com.itheima.service;

public interface AccountService {
    void transfer(String sname, String tname, Double money);
    void outUpdate(String tname, Double money);
}

