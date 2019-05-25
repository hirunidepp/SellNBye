package com.sellNBye.Repository;

import com.sellNBye.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmailAndPw(String email, String pw);
    User findByEmail(String email);
    User findByUnameAndPw(String uname, String pw);
}
