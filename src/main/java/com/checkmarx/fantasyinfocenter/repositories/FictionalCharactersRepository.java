package com.checkmarx.fantasyinfocenter.repositories;

import com.checkmarx.fantasyinfocenter.models.FictionalCharacter;
import org.springframework.data.repository.CrudRepository;

public interface FictionalCharactersRepository extends CrudRepository<FictionalCharacter, Integer> {
}
