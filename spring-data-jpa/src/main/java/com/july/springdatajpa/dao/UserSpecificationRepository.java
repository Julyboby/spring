package com.july.springdatajpa.dao;

import com.july.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Description 基于Criteria API的查询
 * @Param
 * @return
 * @Date 2018/10/09 14:58
 * @Author July
 **/
public interface UserSpecificationRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
}
