package com.ferallove.dto;

import lombok.*;

import java.time.Instant;

@Data @AllArgsConstructor
public class StoriesDTO {

    private String name;
    private Instant adoptionDate;
    private String story;
}
