/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
/**
 *
 * @author Satguru Pyari
 */
public class UserDao {
    public static void save( User user){
        String query = "insert into user(name,email,mobileNumber,password,confirmpassword,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobile()+"','"+user.getPassword()+"','"+user.getConfirmPassword()+"','true')";
        DbOperations.setDataOrDelete(query,"registered successfully!wait for admin Approval");
        
    }
    
    public static User Login(String email,String password){
        User user = null;
        try{
           ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
           while (rs.next()){
               user = new User() ;
               user.setStatus(rs.getString("status"));
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static int getUserId(String email){
        int id = 0;
        try{
            ResultSet rs = DbOperations.getData("select * from user where email = '"+email+"'");
            while(rs.next()){
                id = rs.getInt("id");
            }
                

        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        return id; 
    }
    public static User getPassword(String email){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where email = '" + email + "'");
            while(rs.next()){
                user = new User();
                user.setPassword(rs.getString("password"));
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    
    public static void update(String email,String newPassword){
        String query = "update user set password = '"+newPassword+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query,"password changed successfully");
    }
    
    public static void changePassword(String email,String oldpassword,String newPassword){
        try{
            ResultSet rs = DbOperations.getData("SELECT *from user WHERE email = '" + email + "' and password = '" + oldpassword+ "'");
            if(rs.next()){
                update(email,newPassword);
            }
            else{
                JOptionPane.showMessageDialog(null,"old password incorrect");
            }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
}
}



