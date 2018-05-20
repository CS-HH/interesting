package com.iFox.hh.service.login;

import com.iFox.hh.dao.login.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 用户注册service
 *
 * @author exphuhong
 * @since 16:51 2018/5/20
 */
@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    @Transactional
    public String addAvatar(String avatar,String account) {

        int status = registerRepository.updateAvatarByAccount(avatar, account);

        String msg = status > 0 ? "1" : "0";

        return msg;
    }
}
