package com.example.manageeducation.service;

import com.example.manageeducation.entity.Role;
import com.example.manageeducation.enums.RoleType;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface RoleService {
    Role GetRoleByName();
}
