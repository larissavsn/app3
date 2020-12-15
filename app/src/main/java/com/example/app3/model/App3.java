package com.example.app3.model;

public class App3 {
    private int img;
    private String name;
    private String cityState;
    private String history;

    public App3(){

    }

    public App3(int img, String name, String cityState, String historico){
        this.img = img;
        this.name = name;
        this.cityState = cityState;
        this.history = historico;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String historico) {
        this.history = historico;
    }
}
