package com.iFox.hh.service.login;

import com.iFox.hh.common.exception.LoginException;
import com.iFox.hh.dao.login.LoginRepository;
import com.iFox.hh.dto.UserDTO;
import com.iFox.hh.entity.User;
import com.iFox.hh.utils.jwt.JWTUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private LoginRepository loginRepository;
    /**
     * 登录并获取数据dto
     * */
    public UserDTO login(String account,String password){

        logger.debug("尝试登录的用户名和密码："+account+"、"+password);

        User user = loginRepository.findByAccountAndPassword(account, password);

        if (user == null) {
            throw new LoginException("登录用户不存在");
        }

        return new UserDTO(user.getNickName(),user.getAccount(),user.getSex(),user.getEmail()
        ,user.getAge(),user.getAvatar(),user.getFriends());
    }
}
