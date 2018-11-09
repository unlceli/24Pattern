package com.example.li.lll.a24patternproject.prototype;

import java.io.Serializable;

public class WorkExperience implements Serializable{

    private static final long serialVersionUID = 1L;

    private String workDate;
    private String workCompany;

    public String getWorkDate(){
        return workDate;
    }
    public WorkExperience setWorkDate(String workDate){
        this.workDate =workDate;
        return this;
    }
    public String getWorkCompany(){
        return workCompany;
    }
    public WorkExperience setWorkCompany(String workCompany){
        this.workCompany =workCompany;
        return this;
    }

}
