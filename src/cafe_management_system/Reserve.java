/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe_management_system;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import model.*;
import DAO.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DateFormatter;

/**
 *
 * @author salma
 */
public class Reserve extends javax.swing.JFrame {
    String userEmail;
    public String emailpattern = "^(.+)@(.+)$";
    public String mobilNumberPattern = "^[0-9]*$";
    public String datePattern = "(((20[012]\\d|19\\d\\d)|(1\\d|2[0123]))-((0[0-9])|(1[012]))-((0[1-9])|([12][0-9])|(3[01])))";
    /**
     * Creates new form Reservation
     */
    public void validateFields(){
        String email = Email.getText();
        String name = Name.getText();
        String number = MobileNumber.getText();
        String Date = txtDate.getText();
        if(email.matches(emailpattern) && !name.equals("") && number.matches(mobilNumberPattern) && Date.matches(datePattern)){
            save.setEnabled(true);
            Delete.setEnabled(true);
            Update.setEnabled(true);
        }
        else{
            save.setEnabled(false);
            Delete.setEnabled(false);
            Update.setEnabled(false);
        }
    }
    public Reserve() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
    }
    public Reserve(String email){
        initComponents();
        this.userEmail = email;
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        MobileNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTable = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        save2 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setBackground(new java.awt.Color(102, 102, 102));
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameKeyReleased(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 280, 32));

        jLabel1.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        Email.setBackground(new java.awt.Color(102, 102, 102));
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailKeyReleased(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 280, 32));

        MobileNumber.setBackground(new java.awt.Color(102, 102, 102));
        MobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        MobileNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNumberActionPerformed(evt);
            }
        });
        MobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 280, 32));

        jLabel2.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 120, -1));

        jLabel3.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MobileNumber");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, -1));

        jLabel4.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, -1));

        txtDate.setBackground(new java.awt.Color(102, 102, 102));
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateKeyReleased(evt);
            }
        });
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 280, 32));

        jLabel5.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 120, -1));

        txtTime.setBackground(new java.awt.Color(102, 102, 102));
        txtTime.setForeground(new java.awt.Color(255, 255, 255));
        txtTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        txtTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimeKeyReleased(evt);
            }
        });
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 280, 32));

        save.setBackground(new java.awt.Color(0, 102, 0));
        save.setFont(new java.awt.Font("Manrope", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 70, 30));

        showTable.setBackground(new java.awt.Color(204, 204, 204));
        showTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Email", "mobileNumber", "Date", "Time"
            }
        ));
        showTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 553, 486));

        Delete.setBackground(new java.awt.Color(204, 0, 0));
        Delete.setFont(new java.awt.Font("Manrope", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 80, 30));

        jLabel6.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RESERVATIONS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Manrope", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1259, 17, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 132, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 15, -1, -1));

        save1.setBackground(new java.awt.Color(0, 102, 0));
        save1.setFont(new java.awt.Font("Manrope", 1, 14)); // NOI18N
        save1.setForeground(new java.awt.Color(255, 255, 255));
        save1.setText("Save");
        save1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        getContentPane().add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 70, 30));

        save2.setBackground(new java.awt.Color(0, 102, 0));
        save2.setFont(new java.awt.Font("Manrope", 1, 14)); // NOI18N
        save2.setForeground(new java.awt.Color(255, 255, 255));
        save2.setText("Save");
        save2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        getContentPane().add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 70, 30));

        Update.setBackground(new java.awt.Color(0, 102, 0));
        Update.setFont(new java.awt.Font("Manrope", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 80, 30));

        txtId.setText("00");
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void MobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNumberActionPerformed
        // TODO add your handling code here:s
    }//GEN-LAST:event_MobileNumberActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String customerName = Name.getText();
        String  customerMobileNumber = MobileNumber.getText();
        String customerEmail = Email.getText();
        DateTimeFormatter dFormat = DateTimeFormatter.ISO_DATE;
        LocalDate date = LocalDate.parse(txtDate.getText(),dFormat);
        LocalTime time = LocalTime.parse(txtTime.getText());
        String createdBy = userEmail;
        
        Customer customer = new Customer();
        customer.setName(customerName);
        customer.setEmail(customerEmail);
        customer.setMobileNumber(customerMobileNumber);
        CustomerDao.save(customer);
        
        Reservation reserve= new Reservation();
        reserve.setDate(date);
        reserve.setRtime(time);
        reserve.setC_id(CustomerDao.get_c_id(customerName));
        reserve.setE_id(UserDao.getUserId(userEmail));
        ReserveDao.save(reserve);
        setVisible(false);
            new Reserve(userEmail).setVisible(true);
        
//        DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
//        dtm.addRow(new Object[]{customerName,customerEmail,customerMobileNumber,date,time});
        
    }//GEN-LAST:event_saveActionPerformed

    private void showTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showTableMouseClicked
        // TODO add your handling code here:
        int index = showTable.getSelectedRow();
        TableModel model = showTable.getModel();
        String id = model.getValueAt(index, 0).toString();
        txtId.setText(id);
        String name = model.getValueAt(index,1).toString();
        Name.setText(name);
        String email = model.getValueAt(index, 2).toString();
        String mobileNumber = model.getValueAt(index, 3).toString();
        String date = model.getValueAt(index, 4).toString();
        String time = model.getValueAt(index, 5).toString();
        Email.setText(email);
        MobileNumber.setText(mobileNumber);
        txtDate.setText(date);
        txtTime.setText(time);
        
        Update.setEnabled(true);
        Delete.setEnabled(true);
        
    }//GEN-LAST:event_showTableMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
        ArrayList<ResCustomer> list = ReserveDao.getAllRecords();
        Iterator<ResCustomer> itr = list.iterator();
        while (itr.hasNext()) {
            ResCustomer customerObj = itr.next();
            dtm.addRow(new Object[]{customerObj.getId(),customerObj.getName(), customerObj.getEmail(), customerObj.getMobileNumber(), customerObj.getDate(),customerObj.getTime()});
        }
    }//GEN-LAST:event_formComponentShown

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String id=txtId.getText();
        ReserveDao.delete(id);
        Delete.setEnabled(false);
        setVisible(false);
        new Reserve(userEmail).setVisible(true);
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
            setVisible(false);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save2ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = Name.getText();
        String email = Email.getText();
        String mobile = MobileNumber.getText();
        String date = txtDate.getText();
        String time = txtTime.getText();
        ResCustomer reserve = new ResCustomer();
        
        reserve.setId(Integer.parseInt(id));
        reserve.setName(name);
        reserve.setEmail(email);
        reserve.setMobileNumber(mobile);
        DateTimeFormatter dFormat = DateTimeFormatter.ISO_DATE;
        LocalDate dates = LocalDate.parse(date,dFormat);
        LocalTime times = LocalTime.parse(time);
        reserve.setDate(dates);
        reserve.setTime(times);
        
        ReserveDao.update(reserve);
        setVisible(false);
        new Reserve(userEmail).setVisible(true);
    }//GEN-LAST:event_UpdateActionPerformed

    private void NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_NameKeyReleased

    private void EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_EmailKeyReleased

    private void MobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_MobileNumberKeyReleased

    private void txtDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtDateKeyReleased

    private void txtTimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtTimeKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField MobileNumber;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JTable showTable;
    private javax.swing.JTextField txtDate;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
