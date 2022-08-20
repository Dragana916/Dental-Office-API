package com.dentaloffice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponseDTO {

    private UUID id;

    private String firstName;

    private String lastName;

    private String birthDate;

    private String phoneNumber;
}
