package com.example.manageeducation.repository;

import com.example.manageeducation.entity.SyllabusUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyllabusUnitRepository extends JpaRepository<SyllabusUnit, String> {
}
