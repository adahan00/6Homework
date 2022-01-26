package com.example.a6homework;

public class Model {
    private String name;
    private String music;
    private String time;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Model(String name, String music, String time, String number) {
        this.name = name;
        this.music = music;
        this.time = time;
        this.number = number;
    }
}
