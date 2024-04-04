package com.example.manageeducation.controller;

import com.example.manageeducation.dto.request.SyllabusLevelRequest;
import com.example.manageeducation.entity.SyllabusDay;
import com.example.manageeducation.entity.SyllabusLevel;
import com.example.manageeducation.service.SyllabusLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/auth/syllabus")
public class SyllabusLevelController {

    @Autowired
    SyllabusLevelService syllabusLevelService;

    @PostMapping("/syllabus-level")
    public ResponseEntity<?> createSyllabusLevel(@RequestBody SyllabusLevelRequest dto) {
        return ResponseEntity.ok(syllabusLevelService.createSyllabusLevel(dto));
    }

    @PutMapping("/syllabus-level/{syllabus-level-id}")
    public ResponseEntity<?> updateSyllabusLevel(@PathVariable("syllabus-level-id") UUID id, @RequestBody SyllabusLevelRequest dto) {
        return ResponseEntity.ok(syllabusLevelService.updateSyllabusLevel(id,dto));
    }

    @GetMapping("/syllabus-levels")
    public ResponseEntity<?> syllabusLevels() {
        return ResponseEntity.ok(syllabusLevelService.syllabusLevelResponse());
    }
}