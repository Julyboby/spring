package com.july.springdatajpa.dao;

import org.springframework.beans.factory.annotation.Value;

public interface UserProjection {
    @Value("#{target.name + ' ' + target.password}")
    String getName();

    String getPassword();

}
