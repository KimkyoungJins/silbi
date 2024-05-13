package com.example.hotspot_local.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spicyLevel;
    private String CharacterName;
    private String CharacterImageSrc;
    private String explanation1;
    private String explanation2;
}
