package com.example.hotspot_local.controller.response;

import lombok.Data;

@Data
public class ScoreResponse {
    private int score;
    private String category;

    public ScoreResponse(int score, String category) {
        this.score = score;
        this.category = category;
    }

}
