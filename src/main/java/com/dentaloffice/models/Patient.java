package com.dentaloffice.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "First name can not be null!")
    @Size(min=2, max= 25, message = "First name must be grater than 1 character and not grater than 25 characters!")
    @Pattern(regexp = "^[a-zA-Z]*", message = "First name can not be a number!")
    private String firstName;

    @NotNull(message = "Last name can not be null!")
    @Size(min=2, max=30, message = "Last name must be grater than 1 character and not grater than 30 characters!")
    @Pattern(regexp = "^[a-zA-Z]*", message = "Last name can not be a number!")
    private String lastName;

    @NotNull(message = "Date of birth can not be null!")
    private String dateOfBirth;

    @NotBlank(message = "Phone number can not be null!")
    @Pattern(regexp = "[0-9]{11,15}", message = "Phone number can not be a character and must be grater than 10 or less than 15 numbers!")
    private String phoneNumber;
}
