package com.neurosky.mindwavemobiledemo;

/**
 * Created by samo5 on 2017-08-26.
 */

public class BrainData {

    private String time = "시간정보없음";
    private String meditation = "0";
    private String attention = "0";
    private String delta = "0";
    private String theta = "0";
    private String lowAlpha = "0";
    private String highAlpha = "0";
    private String lowBeta = "0";
    private String highBeta = "0";
    private String lowGamma = "0";
    private String middleGamma = "0";

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMeditation() {
        return meditation;
    }

    public void setMeditation(String meditation) {
        this.meditation = meditation;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        attention = attention;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public String getTheta() {
        return theta;
    }

    public void setTheta(String theta) {
        this.theta = theta;
    }

    public String getLowAlpha() {
        return lowAlpha;
    }

    public void setLowAlpha(String lowAlpha) {
        this.lowAlpha = lowAlpha;
    }

    public String getHighAlpha() {
        return highAlpha;
    }

    public void setHighAlpha(String highAlpha) {
        this.highAlpha = highAlpha;
    }

    public String getLowBeta() {
        return lowBeta;
    }

    public void setLowBeta(String lowBeta) {
        this.lowBeta = lowBeta;
    }

    public String getHighBeta() {
        return highBeta;
    }

    public void setHighBeta(String highBeta) {
        this.highBeta = highBeta;
    }

    public String getLowGamma() {
        return lowGamma;
    }

    public void setLowGamma(String lowGamma) {
        this.lowGamma = lowGamma;
    }

    public String getMiddleGamma() {
        return middleGamma;
    }

    public void setMiddleGamma(String middleGamma) {
        this.middleGamma = middleGamma;
    }

    public String getBrainTextString(){

        return time+" "+meditation+" "+attention+" "+delta+" "+theta+" "+lowAlpha+" "+highAlpha+" "+lowBeta+" "+highBeta+" "+lowGamma+" "+middleGamma+"\n";
    }



}
