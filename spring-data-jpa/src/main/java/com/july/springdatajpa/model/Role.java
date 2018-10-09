package com.july.springdatajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @program: 权限实体类
 * @description:
 * @author: July
 * @create: 2018-09-05 15:02
 **/

@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = -463669689326264297L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int id;

    @Column(name = "role")
    private String role;

    @JsonIgnore
    @ManyToMany(mappedBy="roles",cascade = CascadeType.MERGE)
    private Set<User> users;

    public Role(String role) {
        this.role = role;
    }

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}