package com.itheima.utils;

import java.util.UUID;

public class UidUtil {

    public static String getUid(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
