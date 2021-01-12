/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_opp;


import banking_management_system.deposit_ui;
import banking_management_system.loging;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author KNOX
 */
public class account_handle {
    
    public void search(int acc_no,JTextField cur_bal){
        try{
          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
            String sql ="select balance from acc_details where acc_no=?";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,acc_no );
            
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                cur_bal.setText(rs.getString("balance"));
                
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public int deposit(double amount,double current_bal,JTextField acc_no){
        
        int x =0;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
            String sql ="update acc_details set balance = ? where acc_no=?";
            
            
            
            
            if(amount > 0) {
                
                current_bal = current_bal+amount;
                
            PreparedStatement pstmt = con.prepareStatement(sql);
           
            pstmt.setDouble(1, current_bal);
            pstmt.setInt(2, Integer.parseInt(acc_no.getText()));
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "'"+amount+"' deposited successfully press OK to back");
            
                
                x=1;
                
            }
            else{
                JOptionPane.showMessageDialog(null, "error occured");
            }
           
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return x;
    }
    
    public int withdraw(double amount,double current_bal,JTextField acc_no){
        int x =0;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
            String sql ="update acc_details set balance = ? where acc_no=?";
            
            
            
            
            if(amount < current_bal) {
                
                current_bal = current_bal-amount;
                
            PreparedStatement pstmt = con.prepareStatement(sql);
           
            pstmt.setDouble(1, current_bal);
            pstmt.setInt(2, Integer.parseInt(acc_no.getText()));
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "'"+amount+"' withdrawed successfully press OK to back");
            
                
                x=1;
                
            }
            else{
                JOptionPane.showMessageDialog(null, "insufficent balance");
            }
           
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return x;
        
    }
}
