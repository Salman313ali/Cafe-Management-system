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
public class Reservation {
     private int id;
     private LocalDate reserveDate ;
     private Date currentDate ;
     private LocalTime Rtime;
     private int c_id;

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }
     private int e_id;
     

    public int getC_id() {
        return c_id;
    }

    public int getE_id() {
        return e_id;
    }

    public LocalTime getRtime() {
        return Rtime;
    }

    public void setRtime(LocalTime Rtime) {
        this.Rtime = Rtime;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.reserveDate = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return reserveDate;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getCreatedBy() {
        return createdBy;
    }
     private LocalTime time ;
     private String createdBy;
}
