package com.iFox.hh.dto;

import com.iFox.hh.entity.User;

import java.util.List;

/**
 * 返回给应用程序的数据对象
 *@author exphuhong
 *@since  16:55 2018/5/19
 *
 */
public class UserDTO extends User{

    private String jwt;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public UserDTO(String nickName, String account, int sex, String email, int age, String avatar, List<User> friends,String jwt) {
        super(nickName, account, sex, email, age, avatar, friends);
        this.jwt = jwt;
    }
}
