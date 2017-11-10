package com.horseapp.model;

public class Horse {

    private String horseFileName; // for image

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private  String message;

    public Horse(String horseFileName, String message) {
        this.horseFileName = horseFileName;
        this.message = message;
    }



    public String getHorseFileName() {
        return horseFileName;
    }

    public void setHorseName(String horseFileName) {
        this.horseFileName = horseFileName;
    }

}
