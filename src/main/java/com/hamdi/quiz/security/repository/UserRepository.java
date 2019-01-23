package com.hamdi.quiz.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hamdi.quiz.model.security.User;
import java.util.List;
/**
 * Created by BMH
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    void delete (User user);
   
    List<User> findAll();

    List<User> findAllById(Long id);
}
