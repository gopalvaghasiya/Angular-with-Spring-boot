package com.gopal.demo.repo;

import org.springframework.data.repository.CrudRepository;
import com.gopal.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
