package com.demo.spring_sec_notes_app.repositories;

import com.demo.spring_sec_notes_app.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Paul Badea
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);

    Boolean existsByUserName(String userName);
}
