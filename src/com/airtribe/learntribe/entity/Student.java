package com.airtribe.learntribe.entity;

public class Student {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String batch;
    private Boolean active;

    public Student() {
    }

    public Student(String id, String firstname, String lastname, String email, String batch, Boolean active) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.batch = batch;
        this.active = active;
    }

    public Student(String id, String firstname, String lastname, String batch, Boolean active) {
        this(id, firstname, lastname, null, batch, active);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}