/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_opp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author KNOX
 */
public class search_acc {
    
    public void search_by_no(JTable table1,String accno){
        
        
       // if(search_txt.getText().trim().i)
        
        try{Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
        String sql = "select * from acc_details where acc_no='"+accno+"'";
        
        PreparedStatement psmt = con.prepareStatement(sql);
        ResultSet rs =psmt.executeQuery();
        table1.setModel(DbUtils.resultSetToTableModel(rs)); 
        }catch(Exception e){
            System.out.println(e);
    }
    
}
    public void search_by_name(JTable table1,String name){
        
        
        String char1="%";
        String search =name +""+char1;
        JTable jtable=table1;
        try{Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
        String sql = "select * from acc_details WHERE name LIKE '"+search+ "'";
        
        PreparedStatement psmt = con.prepareStatement(sql);
        ResultSet rs =psmt.executeQuery();
        jtable.setModel(DbUtils.resultSetToTableModel(rs)); 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void search_bal(JTable table1,String accno){
       
        JTable jtable=table1;
        try{Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
        String sql = "select acc_no,name,balance from acc_details where acc_no='"+accno+"'";
        
        PreparedStatement psmt = con.prepareStatement(sql);
        ResultSet rs =psmt.executeQuery();
        jtable.setModel(DbUtils.resultSetToTableModel(rs)); 
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}