package com.checkmarx.fantasyinfocenter.controllers;

import com.checkmarx.fantasyinfocenter.dtos.FictionalCharacterPostDto;
import com.checkmarx.fantasyinfocenter.models.FictionalCharacter;
import com.checkmarx.fantasyinfocenter.repositories.FictionalCharactersRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fictional-characters")
public class FictionalCharactersController {

    @Autowired
    private FictionalCharactersRepository fictionalCharactersRepository;

    @GetMapping("")
    public @ResponseBody Iterable<FictionalCharacter> getAllFictionalCharacters() {
        return fictionalCharactersRepository.findAll();
    }

    @PostMapping("")
    public @ResponseBody FictionalCharacter addNewFictionalCharacter(@RequestBody FictionalCharacterPostDto fictionalCharacterPostDto) {
        FictionalCharacter fictionalCharacter = new FictionalCharacter();
        BeanUtils.copyProperties(fictionalCharacterPostDto, fictionalCharacter);
        return fictionalCharacter;
    }
}
