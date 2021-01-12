/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_opp;

import banking_management_system.admin_ui;
import banking_management_system.loging;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author KNOX
 */
public class sys_log {
    
    public String sys_login_admin(String user,String pass){
       String s = null; 
        try{
            db_connection connection= new db_connection();
            
            connection.newconnection();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
            Statement stmt=con.createStatement();
            String sql="select * from admin where username='"+user+"' and password='"+pass+"'";
            ResultSet rs =stmt.executeQuery(sql);
            
            
            if(rs.next()){
                 s= rs.getString(1);
               
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       return s;
    }
    
    public String sys_login_cashier(String user,String pass){
    
        String s = null; 
        try{
            db_connection connection= new db_connection();
            
            connection.newconnection();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
            Statement stmt=con.createStatement();
            String sql="select * from cashier where username='"+user+"' and password='"+pass+"'";
            ResultSet rs =stmt.executeQuery(sql);
            
            
            if(rs.next()){
                 s= rs.getString(1);
               
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       return s;
    }
    
}
