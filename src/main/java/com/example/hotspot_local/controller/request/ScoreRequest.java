package com.example.hotspot_local.controller.request;

import lombok.Data;

//}
@Data
public class ScoreRequest {
    private int surveyScore[] = new int[17];

    public ScoreRequest() {}

    public int getScore(int index) {
        return surveyScore[index];
    }
    public void setScore(int index, int score) {
        surveyScore[index] = score;
    }
}
