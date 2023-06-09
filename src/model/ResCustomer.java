/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author salma
 */
public class ResCustomer {
    private String Name;
    private String Email;
    private String MobileNumber;
    private LocalDate date;
    private LocalTime time;
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return Name;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public String getMobileNumber() {
        return MobileNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    
}
