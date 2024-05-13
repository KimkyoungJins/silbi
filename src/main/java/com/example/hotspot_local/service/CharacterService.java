package com.example.hotspot_local.service;

import com.example.hotspot_local.domain.Character;
import com.example.hotspot_local.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// 캐럭터 정보 저장
@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Character saveCharacter(Character character) {
        return characterRepository.save(character);
    }
}