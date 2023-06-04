/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author Salman
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File("C:\\Users\\Satguru Pyari\\Desktop\\bill"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Satguru Pyari\\Desktop\\bill"+id+".pdf");
                        
            }
            else
                JOptionPane.showMessageDialog(null, "file not exists");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
