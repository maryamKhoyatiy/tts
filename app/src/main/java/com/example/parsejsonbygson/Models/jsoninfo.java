package com.example.parsejsonbygson.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tmb on 10/24/17.
 */

public class jsoninfo {
    @SerializedName("System")
    @Expose
    private String system;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Path")
    @Expose
    private String path;
    @SerializedName("Job")
    @Expose
    private String job;
    @SerializedName("Work")
    @Expose
    private String work;
    @SerializedName("Sport")
    @Expose
    private Sport sport;
    @SerializedName("Weather")
    @Expose
    private String weather;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

}

