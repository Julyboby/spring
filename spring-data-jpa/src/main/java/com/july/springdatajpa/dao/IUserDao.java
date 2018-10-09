package com.july.springdatajpa.dao;

import com.july.springdatajpa.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;

import javax.persistence.QueryHint;
import javax.transaction.Transactional;
import java.util.List;

import static org.hibernate.jpa.QueryHints.HINT_COMMENT;

@Transactional(rollbackOn = Exception.class)
public interface IUserDao extends JpaRepository<User, Integer> {

    /**
     * @Description @Modifying说明该方法是修改操作
     * @Param
     * @return
     * @Date 2018/10/08 11:35
     * @Author July
    **/
    @Modifying
    @Query("update User set name=:name, age=:age, password=:password where id=:id")
    void updateUser(@Param("name") String name, @Param("age") Integer age, @Param("password") String password, @Param("id") Integer id);

    /**
     * @Description 根据名字查询
     * @Param
     * @return
     * @Date 2018/10/08 11:37
     * @Author July
    **/
    List<User> findByName(String name);

    /**
     * 根据名称及年龄查询
     *
     * @return
     */
    User findByNameAndAge(String name, Integer age);

    /**
     * 根据名字模糊查询
     *
     * @return
     */
    List<User> findByNameContaining(String name);

    /**
     * 根据年龄进行分页查询
     *
     * @param age
     * @param pageable
     * @return
     */
    @QueryHints(value = {@QueryHint(name = HINT_COMMENT,value = "a query for pageable")})
    Page<User> findByAge(Integer age, Pageable pageable);


    /**
     * @Description 某个用户下的所有权限
     * @Param
     * @return
     * @Date 2018/10/08 18:33
     * @Author July
     **/
    @Query(value = "select u from User as u left join UserRole as ur on ur.userId = u.id left join Role as r on r.id = ur.roleId where r.id =:id")
    List<User> findUserByRoles(Integer id) ;


    @Query(value = "select u.name as name ,u.password as password from User as u")
    List<UserProjection> findAllProjectedBy();
}
