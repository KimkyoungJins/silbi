package com.example.hotspot_local.service;

import com.example.hotspot_local.controller.request.ScoreRequest;

public class ScoreService {
    public static double calculateAverageScore(ScoreRequest scoreRequest) {
        int sum = 0;
        for (int i = 0; i < 17; i++) {
            sum += scoreRequest.getScore(i);
        }
        return sum / 17.0;
    }
}