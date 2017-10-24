package com.example.parsejsonbygson.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tmb on 10/24/17.
 */

public class Sport {

    @SerializedName("MatchNo")
    @Expose
    private String matchNo;
    @SerializedName("Score")
    @Expose
    private String score;
    @SerializedName("Date")
    @Expose
    private String date;

    public String getMatchNo() {
        return matchNo;
    }

    public void setMatchNo(String matchNo) {
        this.matchNo = matchNo;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
