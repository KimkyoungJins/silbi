package com.example.hotspot_local.controller;

import com.example.hotspot_local.controller.request.ScoreRequest;
import com.example.hotspot_local.service.ScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class ScoreController {

    @PostMapping("/average")
    public ResponseEntity<Double> calculateAverage(@RequestBody ScoreRequest scoreRequest) {
        double averageScore = ScoreService.calculateAverageScore(scoreRequest);
        return ResponseEntity.ok(averageScore);
    }
}