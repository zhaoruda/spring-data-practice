package com.springdata.practice.repository.crudRepository;

import com.springdata.practice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Long> {
}
