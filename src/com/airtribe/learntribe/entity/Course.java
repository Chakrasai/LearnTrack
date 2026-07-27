package com.airtribe.learntribe.entity;

public class Course {
    private String id;
    private String coursename;
    private String description;
    private Integer durationInweeks;
    private Boolean active;

    public Course() {
    }

    public Course(String id, String coursename, String description, Integer durationInweeks, Boolean active) {
        this.id = id;
        this.coursename = coursename;
        this.description = description;
        this.durationInweeks = durationInweeks;
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDurationInweeks() {
        return durationInweeks;
    }

    public void setDurationInweeks(Integer durationInweeks) {
        this.durationInweeks = durationInweeks;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}