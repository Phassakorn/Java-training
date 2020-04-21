package com.example.test1.models;

public class TransPortation {

    private String project;
    private String date;
    private String mrt_go;
    private String mrt_back;
    private String bts_go;
    private String bts_back;
    private String bus_go;
    private String bus_back;
    private String van_go;
    private String van_back;
    private String taxi_go;
    private String taxi_back;
    private String bike_go;
    private String bike_back;
    private String other;

    public TransPortation(){}

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMrt_go() {
        return mrt_go;
    }

    public void setMrt_go(String mrt_go) {
        this.mrt_go = mrt_go;
    }

    public String getMrt_back() {
        return mrt_back;
    }

    public void setMrt_back(String mrt_back) {
        this.mrt_back = mrt_back;
    }

    public String getBts_go() {
        return bts_go;
    }

    public void setBts_go(String bts_go) {
        this.bts_go = bts_go;
    }

    public String getBts_back() {
        return bts_back;
    }

    public void setBts_back(String bts_back) {
        this.bts_back = bts_back;
    }

    public String getBus_go() {
        return bus_go;
    }

    public void setBus_go(String bus_go) {
        this.bus_go = bus_go;
    }

    public String getBus_back() {
        return bus_back;
    }

    public void setBus_back(String bus_back) {
        this.bus_back = bus_back;
    }

    public String getVan_go() {
        return van_go;
    }

    public void setVan_go(String van_go) {
        this.van_go = van_go;
    }

    public String getVan_back() {
        return van_back;
    }

    public void setVan_back(String van_back) {
        this.van_back = van_back;
    }

    public String getTaxi_go() {
        return taxi_go;
    }

    public void setTaxi_go(String taxi_go) {
        this.taxi_go = taxi_go;
    }

    public String getTaxi_back() {
        return taxi_back;
    }

    public void setTaxi_back(String taxi_back) {
        this.taxi_back = taxi_back;
    }

    public String getBike_go() {
        return bike_go;
    }

    public void setBike_go(String bike_go) {
        this.bike_go = bike_go;
    }

    public String getBike_back() {
        return bike_back;
    }

    public void setBike_back(String bike_back) {
        this.bike_back = bike_back;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "TransPortation{" +
                "project='" + project + '\'' +
                ", date='" + date + '\'' +
                ", mrt_go='" + mrt_go + '\'' +
                ", mrt_back='" + mrt_back + '\'' +
                ", bts_go='" + bts_go + '\'' +
                ", bts_back='" + bts_back + '\'' +
                ", bus_go='" + bus_go + '\'' +
                ", bus_back='" + bus_back + '\'' +
                ", van_go='" + van_go + '\'' +
                ", van_back='" + van_back + '\'' +
                ", taxi_go='" + taxi_go + '\'' +
                ", taxi_back='" + taxi_back + '\'' +
                ", bike_go='" + bike_go + '\'' +
                ", bike_back='" + bike_back + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
