package com.example.manageeducation.trainingclassservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeliveryTypeResponse {
    private UUID id;
    private String name;
    private String description;
}