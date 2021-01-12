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
public class display_acc_detail {
    
    public void display_acc(JTable table1){
        
        JTable jtable=table1;
        try{Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
        String sql = "select * from acc_details";
        
        PreparedStatement psmt = con.prepareStatement(sql);
        ResultSet rs =psmt.executeQuery();
        jtable.setModel(DbUtils.resultSetToTableModel(rs)); 
        }catch(Exception e){
            System.out.println(e);
        }   
        
    }
}
