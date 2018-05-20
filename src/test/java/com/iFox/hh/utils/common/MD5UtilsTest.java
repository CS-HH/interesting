package com.iFox.hh.utils.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class MD5UtilsTest {

    @Test
    public void md5Message() {
        String test = "54521a";
        System.out.println(MD5Utils.md5Message(test));
    }
}