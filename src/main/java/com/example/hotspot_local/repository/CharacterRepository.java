package com.example.hotspot_local.repository;

import com.example.hotspot_local.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;

// 캐릭터 레포 저장
public interface CharacterRepository extends JpaRepository<Character, Long> {
}