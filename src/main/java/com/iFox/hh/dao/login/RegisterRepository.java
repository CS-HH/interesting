package com.iFox.hh.dao.login;

import com.iFox.hh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface RegisterRepository extends JpaRepository<User, Long> {

    @Modifying
    @Query(value = "update user u set u.avatar = ?1 where u.account = ?2")
    int updateAvatarByAccount(String avatar, String account);
}
