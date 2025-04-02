package com.pm.patientservice.dto;

import com.pm.patientservice.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "DateofBirth is required")
    private String dateofbirth;

    @NotBlank(groups = CreatePatientValidationGroup.class, message = "Registered Date is required")
    private String registeredDate;

    public @NotBlank(message = "Name is required") @Size(max = 100, message = "Name cannot exceed 100 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required") @Size(max = 100, message = "Name cannot exceed 100 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Address is required") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Address is required") String address) {
        this.address = address;
    }

    public @NotBlank(message = "DateofBirth is required") String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(@NotBlank(message = "DateofBirth is required") String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate( String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
