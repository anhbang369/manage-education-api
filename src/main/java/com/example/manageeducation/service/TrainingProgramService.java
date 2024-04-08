package com.example.manageeducation.service;

import com.example.manageeducation.dto.request.TrainingProgramRequest;
import com.example.manageeducation.dto.response.TrainingProgramResponse;
import com.example.manageeducation.dto.response.TrainingProgramsResponse;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import java.util.UUID;

@Service
public interface TrainingProgramService {
    String createTrainingProgram(Principal principal, TrainingProgramRequest dto);
    TrainingProgramResponse viewTrainingProgram(UUID id);
    String deActiveTrainingProgram(UUID id);
    String duplicatedTrainingProgram(Principal principal, UUID id);
    List<TrainingProgramsResponse> trainingPrograms();
}
