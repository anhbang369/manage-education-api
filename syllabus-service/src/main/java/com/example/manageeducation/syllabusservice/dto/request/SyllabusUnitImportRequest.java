package com.example.manageeducation.syllabusservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SyllabusUnitImportRequest {
    private String name;
    private int unitNo;
    private int duration;

    private List<SyllabusUnitChapterRequest> syllabusUnitChapters;
}
