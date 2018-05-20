package com.iFox.hh.rest.login;

import com.iFox.hh.dto.UserDTO;
import com.iFox.hh.service.login.LoginService;
import com.iFox.hh.utils.common.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登录controller
 *
 * @author exphuhong
 * @since 16:51 2018/5/19
 */
@RestController
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    private LoginService loginService;

    @RequestMapping("loginMui")
    public UserDTO login(String account, String password) {

        logger.info("登录------");
        password = MD5Utils.md5Message(password);
        return loginService.login(account, password);
    }
}
