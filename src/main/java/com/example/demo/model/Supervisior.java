package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="supervisiors",schema = "mydb")
public class Supervisior {
    private int supervisior_id;
    private String first_name;
    private String second_name;
    private String email;
    private String phone_number;
    private String address;

    public Supervisior() {
    }

    public Supervisior(int supervisior_id, String first_name, String second_name, String email, String phone_number, String address) {
        this.supervisior_id = supervisior_id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
    }
    @Id
    @Column(name = "supervisior_id",nullable = false)
    public int getSupervisior_id() {
        return supervisior_id;
    }

    public void setSupervisior_id(int supervisior_id) {
        this.supervisior_id = supervisior_id;
    }
    @Basic
    @Column(name = "first_name",nullable = false)
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    @Basic
    @Column(name = "second_name",nullable = false)
    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }
    @Basic
    @Column(name = "email",nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Basic
    @Column(name = "phone_number",nullable = false)
    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    @Basic
    @Column(name = "address",nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
