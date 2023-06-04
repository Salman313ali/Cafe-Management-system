/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

/**
 *
 * @author Salman
 */
public class CategoryDao {
    public static void save(Category category) {
        String query = "insert into category (name) values('"+category.getName()+"')";
        DbOperations.setDataOrDelete(query, "Category added Successfully");
    }
    
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from category");
            while(rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        return arrayList;
    }
    
    public static int get_cat_id(String cat_name){
        int id = 0;
        try{
            ResultSet rs = DbOperations.getData("select * from category where name = '"+cat_name+"'");
            while(rs.next()){
                id = rs.getInt("id");
            }
                

        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        return id; 
    }
    public static void delete(String id){
        String query = "delete from category where id ='"+id+"'";
        DbOperations.setDataOrDelete(query,"Category Deleted Successfully");
    }
}
