/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Customer;

/**
 *
 * @author salma
 */
public class CustomerDao {
    
    public static void save( Customer customer){
        String query = "insert into customer(name,email,mobileNumber) values('"+customer.getName()+"','"+customer.getEmail()+"','"+customer.getMobileNumber()+"')";
        DbOperations.setDataOrDelete(query,"insert successful");
        
    }
    
    public static int get_c_id(String c_name){
        int id = 0;
        try{
            ResultSet rs = DbOperations.getData("select * from customer where Name = '"+c_name+"'");
            while(rs.next()){
                id = rs.getInt("id");
            }
                

        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        return id; 
    }
}
//    
//    public static User Login(String email,String password){
//        User user = null;
//        try{
//           ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
//           while (rs.next()){
//               user = new User() ;
//               user.setStatus(rs.getString("status"));
//           }
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//        return user;
//    }
//    
//    public static int getUserId(String email){
//        int id = 0;
//        try{
//            ResultSet rs = DbOperations.getData("select * from user where email = '"+email+"'");
//            while(rs.next()){
//                id = rs.getInt("id");
//            }
//                
//
//        }
//        catch(Exception e){
//                JOptionPane.showMessageDialog(null, e);
//                }
//        return id; 
//    }
//    public static User getPassword(String email){
//        User user = null;
//        try{
//            ResultSet rs = DbOperations.getData("select *from user where email = '" + email + "'");
//            while(rs.next()){
//                user = new User();
//                user.setPassword(rs.getString("password"));
//                
//            }
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//        return user;
//    }
//    
//    
//    public static void update(String email,String newPassword){
//        String query = "update user set password = '"+newPassword+"' where email='"+email+"'";
//        DbOperations.setDataOrDelete(query,"password changed successfully");
//    }
//    
//    public static void changePassword(String email,String oldpassword,String newPassword){
//        try{
//            ResultSet rs = DbOperations.getData("SELECT *from user WHERE email = '" + email + "' and password = '" + oldpassword+ "'");
//            if(rs.next()){
//                update(email,newPassword);
//            }
//            else{
//                JOptionPane.showMessageDialog(null,"old password incorrect");
//            }
//        
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//}
//}

