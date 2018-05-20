package com.iFox.hh.dao.login;

import com.iFox.hh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 登录dao
 *
 * @author exphuhong
 * @since 17:49 2018/5/19
 */
public interface LoginRepository extends JpaRepository<User, Long> {

    User findByAccountAndPassword(String account, String password);
}
