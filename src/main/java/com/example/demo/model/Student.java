package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name="students",schema = "mydb")
public class Student {
    private    int student_id;
    private    String first_name;
    private    String secound_name;
    private    int age;
    //replaces class in database as class is keyword in java
    private    String group;
    private    String phone_number;
    private    String email;
    private    String address;
    private    int supervisior_id;

    public Student() {
    }

    public Student(int student_id, String first_name, String secound_name, int age, String group, String phone_number, String email, String address, int supervisior_id) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.secound_name = secound_name;
        this.age = age;
        this.group = group;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
        this.supervisior_id = supervisior_id;
    }
    @Id
    @Column(name = "student_id",nullable = false)
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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
    public String getSecound_name() {
        return secound_name;
    }

    public void setSecound_name(String secound_name) {
        this.secound_name = secound_name;
    }
    @Basic
    @Column(name = "age",nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Basic
    @Column(name = "class",nullable = false)
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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
    @Column(name = "email",nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Basic
    @Column(name = "address",nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Basic
    @Column(name = "supervisior_id",nullable = false)
    public int getSupervisior_id() {
        return supervisior_id;
    }

    public void setSupervisior_id(int supervisior_id) {
        this.supervisior_id = supervisior_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", first_name='" + first_name + '\'' +
                ", secound_name='" + secound_name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", supervisior_id=" + supervisior_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return student_id == student.student_id &&
                age == student.age &&
                supervisior_id == student.supervisior_id &&
                Objects.equals(first_name, student.first_name) &&
                Objects.equals(secound_name, student.secound_name) &&
                Objects.equals(group, student.group) &&
                Objects.equals(phone_number, student.phone_number) &&
                Objects.equals(email, student.email) &&
                Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_id, first_name, secound_name, age, group, phone_number, email, address, supervisior_id);
    }

}
