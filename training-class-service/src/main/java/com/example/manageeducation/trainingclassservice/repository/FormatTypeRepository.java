package com.example.manageeducation.trainingclassservice.repository;

import com.example.manageeducation.trainingclassservice.model.FormatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FormatTypeRepository extends JpaRepository<FormatType, UUID> {
    @Query("SELECT f from FormatType f where f.name=?1")
    FormatType findByName(String name);
}
