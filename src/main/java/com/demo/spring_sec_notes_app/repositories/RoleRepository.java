package com.demo.spring_sec_notes_app.repositories;

/**
 * @author Paul Badea
 **/
import com.demo.spring_sec_notes_app.models.AppRole;
import com.demo.spring_sec_notes_app.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}

