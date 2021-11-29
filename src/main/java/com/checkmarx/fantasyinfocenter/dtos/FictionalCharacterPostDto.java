package com.checkmarx.fantasyinfocenter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FictionalCharacterPostDto {

    private String name;
    private String dateOfBirth;
}
