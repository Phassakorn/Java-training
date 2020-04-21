package com.example.test1.models;

public class TimeSheet {

        private String status;
    private String project;
    private String task;
    private String comp;
    private String date;
    private String time_in;
    private String time_out;
    private String manday;
    private String remark;

    public TimeSheet(){
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime_in() {
        return time_in;
    }

    public void setTime_in(String time_in) {
        this.time_in = time_in;
    }

    public String getTime_out() {
        return time_out;
    }

    public void setTime_out(String time_out) {
        this.time_out = time_out;
    }

    public String getManday() {
        return manday;
    }

    public void setManday(String manday) {
        this.manday = manday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TimeSheet{" +
                "status='" + status + '\'' +
                ", project='" + project + '\'' +
                ", task='" + task + '\'' +
                ", comp='" + comp + '\'' +
                ", date='" + date + '\'' +
                ", time_in='" + time_in + '\'' +
                ", time_out='" + time_out + '\'' +
                ", manday='" + manday + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}



