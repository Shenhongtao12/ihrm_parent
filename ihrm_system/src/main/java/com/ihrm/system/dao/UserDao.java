package com.ihrm.system.dao;

import com.ihrm.domain.system.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Hongtao Shen
 * @date 2020/4/26 - 10:42
 **/
public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {
}
