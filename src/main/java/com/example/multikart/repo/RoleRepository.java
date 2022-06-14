package com.example.multikart.repo;

import com.example.multikart.domain.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findAllByStatus(Integer status);

    Role findByRoleIdAndStatus(Long roleId, Integer status);

    int countByNameAndStatus(String name, Integer status);
}
