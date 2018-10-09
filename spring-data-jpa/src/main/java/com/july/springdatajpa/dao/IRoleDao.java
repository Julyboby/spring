package com.july.springdatajpa.dao;

import com.july.springdatajpa.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional(rollbackOn = Exception.class)
public interface IRoleDao extends JpaRepository<Role, Integer> {

    /**
     * @Description 某个权限下的所有用户
     * @Param
     * @return
     * @Date 2018/10/08 18:33
     * @Author July
    **/
    @Query(value = "select r from Role as r left join UserRole as ur on ur.roleId=r.id left join User as u on u.id = ur.userId where u.id =:id")
    List<Role> findRoleByUsersId(Integer id);

}
