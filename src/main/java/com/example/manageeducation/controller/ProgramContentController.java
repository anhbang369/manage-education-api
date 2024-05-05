package com.example.manageeducation.controller;

import com.example.manageeducation.service.ProgramContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class ProgramContentController {
    @Autowired
    ProgramContentService programContentService;

    @PreAuthorize("hasAuthority('VIEW_SYLLABUS')")
    @GetMapping("/program-contents")
    public ResponseEntity<?> programContent() {
        return ResponseEntity.ok(programContentService.programContentResponses());
    }
}
