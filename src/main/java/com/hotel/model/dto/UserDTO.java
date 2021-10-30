/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model.dto;

import java.util.Date;

/**
 *
 * @author Tudt
 */
public class UserDTO {

    private String username;
    private String pass;
    private String pass2;
    private String address;
    private Date dob;
    private boolean sex;
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserDTO() {
    }

    public UserDTO(String username, String pass, String pass2, String address, Date dob, boolean sex, String phone) {
        this.username = username;
        this.pass = pass;
        this.pass2 = pass2;
        this.address = address;
        this.dob = dob;
        this.sex = sex;
        this.phone = phone;
    }

}
