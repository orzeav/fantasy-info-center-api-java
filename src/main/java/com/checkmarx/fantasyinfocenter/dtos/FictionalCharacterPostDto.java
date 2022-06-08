package com.checkmarx.fantasyinfocenter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FictionalCharacterPostDto {

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Pattern(regexp = "(\\d{4})(0[1-9]|1[0-2])(\\d{4})")
    private String dateOfBirth;
}
