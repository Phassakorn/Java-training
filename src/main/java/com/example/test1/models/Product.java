package com.example.test1.models;


import java.util.ArrayList;

public class Product {



   private String id;
   private String title;
   private String name;
   private String position;
   private String emp_id;
   private String month;
   private String year;
   private String Start_period;
    private String end_period;
    private String site;
    private String approver;
    private String approver_site;
    private ArrayList<TimeSheet> timesheet;
    private ArrayList<TransPortation> transportation;

    public Product(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStart_period() {
        return Start_period;
    }

    public void setStart_period(String start_period) {
        Start_period = start_period;
    }

    public String getEnd_period() {
        return end_period;
    }

    public void setEnd_period(String end_period) {
        this.end_period = end_period;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getApprover_site() {
        return approver_site;
    }

    public void setApprover_site(String approver_site) {
        this.approver_site = approver_site;
    }

    public ArrayList<TimeSheet> getTimesheet() {
        return timesheet;
    }

    public void setTimesheet(ArrayList<TimeSheet> timesheet) {
        this.timesheet = timesheet;
    }

    public ArrayList<TransPortation> getTransportation() {
        return transportation;
    }

    public void setTransportation(ArrayList<TransPortation> transportation) {
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", emp_id='" + emp_id + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", Start_period='" + Start_period + '\'' +
                ", end_period='" + end_period + '\'' +
                ", site='" + site + '\'' +
                ", approver='" + approver + '\'' +
                ", approver_site='" + approver_site + '\'' +
                ", timesheet=" + timesheet +
                ", transportation=" + transportation +
                '}';
    }

}
