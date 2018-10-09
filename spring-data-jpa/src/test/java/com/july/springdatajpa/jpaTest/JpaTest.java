package com.july.springdatajpa.jpaTest;

import com.july.springdatajpa.dao.IRoleDao;
import com.july.springdatajpa.dao.IUserDao;
import com.july.springdatajpa.dao.UserProjection;
import com.july.springdatajpa.dao.UserSpecificationRepository;
import com.july.springdatajpa.model.Role;
import com.july.springdatajpa.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IRoleDao roleDao;

    @Autowired
    private UserSpecificationRepository userSpecificationRepository;

    @Test
    @Transactional
    public void testFindAll() throws Exception {
        List<UserProjection> users = userDao.findAllProjectedBy();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
    }

    @Test
    @Transactional
    public void insertUser() {
        User user1 = new User();
        user1.setPassword("123456");
        user1.setName("小新");
        user1.setAge(5);
        userDao.save(user1);

        User user2 = new User();
        user2.setPassword("123456");
        user2.setName("风间");
        user2.setAge(5);
        userDao.save(user2);

        User user3 = new User();
        user3.setPassword("123456");
        user3.setName("阿呆");
        user3.setAge(5);
        userDao.save(user3);

        User user4 = new User();
        user4.setPassword("123456");
        user4.setName("正男");
        user4.setAge(5);
        userDao.save(user4);

        User user5 = new User();
        user5.setPassword("123456");
        user5.setName("妮妮");
        user5.setAge(5);
        userDao.save(user5);

    }

    @Test
    @Transactional
    public void insertRole() {
        Role role1 = new Role();
        role1.setRole("新增");
        roleDao.save(role1);
        Role role2 = new Role();
        role2.setRole("删除");
        roleDao.save(role2);
        Role role3 = new Role();
        role3.setRole("修改");
        roleDao.save(role3);
        Role role4 = new Role();
        role4.setRole("查询");
        roleDao.save(role4);

    }

    @Test
    public void findRolesByUserId() {
        List<Role> roles = roleDao.findRoleByUsersId(1);
        for (Role role : roles) {
            System.out.println(role.getRole());
        }

        List<User> users = userDao.findUserByRoles(1);
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void spec() {
        List<User> users = userSpecificationRepository.findAll(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //root.get("name")表示获取name这个字段名称,like表示执行like查询,%小%表示值
                Predicate p1 = criteriaBuilder.like(root.get("name"),"%小%");
                //equal-->"="
                Predicate p2 = criteriaBuilder.equal(root.get("age"),5);
                //将一个查询条件联合起来之后返回Predicate对象
                return criteriaBuilder.and(p1,p2);
            }
        });

        for (User user : users) {
            System.out.println(user.getName());
        }
    }

}
