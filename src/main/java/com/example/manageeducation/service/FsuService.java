package com.example.manageeducation.service;

import com.example.manageeducation.dto.response.FsuTrainingClassResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FsuService {
    List<FsuTrainingClassResponse> listFsu();
}
