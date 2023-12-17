package com.seifeddine.AdvancedCollector.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(NON_DEFAULT)
public class User {
    private Long id;
    @NotEmpty(message = "First name cannot be empty")
    private String first_name;
    @NotEmpty(message = "Last name cannot be empty")
    private String last_name;
    @NotEmpty(message = "Email name cannot be empty")
    private String email;
    private String password;
    private String address;
    private String phone;
    private String title;
    private String bio;
    private Boolean enabled;
    private Boolean non_locked;
    private Boolean using_mfa;
    private String image_url;
    private Date  created_date;



}
