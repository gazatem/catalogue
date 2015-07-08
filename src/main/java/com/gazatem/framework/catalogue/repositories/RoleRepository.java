package com.gazatem.framework.catalogue.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gazatem.framework.catalogue.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Serializable>
{

}
