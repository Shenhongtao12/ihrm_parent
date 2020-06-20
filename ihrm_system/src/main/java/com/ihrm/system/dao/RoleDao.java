package com.ihrm.system.dao;



import com.ihrm.domain.system.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
  * 企业数据访问接口
  */
public interface RoleDao extends JpaRepository<Role, String>, JpaSpecificationExecutor<Role> {

}