package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "helloes")
public class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String fullName;
    private int stdId;

    public Demo() {
    }

    public Demo(int id, String name, String fullName, int stdId) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.stdId = stdId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStdId() {
        return this.stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

}