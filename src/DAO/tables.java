/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Satguru Pyari
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(20),password varchar(200),confirmpassword varchar(200),UNIQUE(email),status varchar(50))";
            String adminDetails = "insert into user(name,email,mobileNumber,password,confirmPassword, status) values('Admin','admin@gmail.com','1234567890','admin','admin', 'true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String billTable = "create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200),emp_id int,foreign key (emp_id) references user(id))";
            String productTable = "Create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200), cat_id int, foreign key (cat_id) references category(id))";
            String customerTable = "create table customer(id int auto_increment primary key,Name varchar(20),MobileNumber varchar(30),Email varchar(200))";
            String ReservationTable = "create table reservation(id int auto_increment primary key,Rtime time,Rdate date,Cdate date ,c_id int , e_id int,foreign key (c_id) references customer(id),foreign key (e_id) references user(id))";
           
            String delimiter="create procedure updateData(in myid int,in Cname varchar(50),in Cemail varchar(200),in CmobileNumber varchar(30),in Dates date,in times time) begin declare Cid int; select id into Cid from reservation r where r.id = myid; update reservation set Rtime=times, Rdate=Dates where id=myid; update customer set Name=Cname,Email=Cemail,MobileNumber=CmobileNumber where id=Cid; end ";

            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details added Successfully");
            DbOperations.setDataOrDelete(categoryTable,"Category Table Created Successfully");
            DbOperations.setDataOrDelete(productTable,"Product Table Created Successfully"); 
            DbOperations.setDataOrDelete(billTable,"Bill Table Created Successfully");
            DbOperations.setDataOrDelete(customerTable,"Customer Table Created Successfully");
            DbOperations.setDataOrDelete(ReservationTable,"Reservation Table Created Successfully");
            DbOperations.setDataOrDelete(delimiter,"deli Table Created Successfully");
            
            
        }
    
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

