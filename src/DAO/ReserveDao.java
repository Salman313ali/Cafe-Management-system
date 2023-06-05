/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import model.Reservation;
import model.ResCustomer;

/**
 *
 * @author salma
 */
public class ReserveDao {
    
    
    public static void save( Reservation reserve){
        String query = "insert into reservation(Rtime,c_id, e_id,Cdate,Rdate) values('"+reserve.getRtime()+"','"+reserve.getC_id()+"','"+reserve.getE_id()+"',curdate(),'"+reserve.getDate()+"')";
        DbOperations.setDataOrDelete(query,"insert successful");
        
    }
    
    public static ArrayList<ResCustomer> getAllRecords(){
        ArrayList<ResCustomer> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select r.id, c.Name,c.Email, c.MobileNumber, r.Rdate, r.Rtime from Customer c\n" +
"join Reservation r on r.c_id = c.id");
            while(rs.next()){
                ResCustomer rescustomer = new ResCustomer();
                rescustomer.setName(rs.getString("Name"));
                rescustomer.setEmail(rs.getString("Email"));
                rescustomer.setMobileNumber(rs.getString("MobileNumber"));
                rescustomer.setDate(rs.getDate("Rdate"));
                rescustomer.setTime(rs.getObject("Rtime", LocalTime.class));
                rescustomer.setId(rs.getInt("id"));
                arrayList.add(rescustomer);
            }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        return arrayList;
    }
}
