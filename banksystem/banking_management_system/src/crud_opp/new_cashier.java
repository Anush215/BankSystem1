/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_opp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author KNOX
 */
public class new_cashier {
    int result;
    public int cashier_create(String username,String password){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
            String sql ="insert into cashier (username,password) values (?,?)";
            PreparedStatement psmt = con.prepareStatement(sql);
           
            
            psmt.setString(1, username);
            psmt.setString(2, password);
            
            
            psmt.executeUpdate();
            result=1;
        }catch(Exception e){
            System.out.println(e);
            result=0;
        }
        return result;
    }
}
