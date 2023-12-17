package com.seifeddine.AdvancedCollector.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(NON_DEFAULT)
public class Role {


    private Long id;
    @NotEmpty(message = "Role name cannot be empty")
    private String name;
    @NotEmpty(message = "Role permission cannot be empty")
    private String permission;


    CONSTRAINT       UQ_Roles_Name UNIQUE (name)
}
