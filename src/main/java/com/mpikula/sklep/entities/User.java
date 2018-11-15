package com.mpikula.sklep.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String login;

    private String password;

    @Column(name = "repeat_password")
    private String repeatPassword;

    private String name;

    private String surname;

    private String city;

    @Column(name = "post_code")
    private String postCode;

    private String street;

    @Column(name = "house_number")
    private int houseNumber;

    @Column(name = "flat_number")
    private int flatNumber;

    @Column(name = "phone_number")
    private String phone;

    public User() {}

    public User(int id, String login, String password, String repeatPassword, String name,
                String surName, String city, String postCode, String street,
                int houseNumber, int flatNumber, String phone) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.repeatPassword = repeatPassword;

        this.name = name;
        this.surname = surName;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getFlatNumberNumber() {
        return flatNumber;
    }

    public void setFlatNumberNumber(int flatNumberNumber) {
        this.flatNumber = flatNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
