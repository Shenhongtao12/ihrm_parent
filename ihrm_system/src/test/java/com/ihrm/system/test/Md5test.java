package com.ihrm.system.test;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.jupiter.api.Test;

/**
 * @author Hongtao Shen
 * @date 2020/5/6 - 13:17
 **/
public class Md5test {

    @Test
    public void test1(){
        String password = new Md5Hash("123456","15191644106",3).toString();
        System.out.println(password);
    }
}
