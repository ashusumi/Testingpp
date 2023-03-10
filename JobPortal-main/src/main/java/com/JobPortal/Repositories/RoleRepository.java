package com.JobPortal.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JobPortal.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
Optional<Role> findByName(String roleName);
}
