/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_opp;

import java.sql.*;


/**
 *
 * @author KNOX
 */
public class acc_crt {
    
    int result;
    public int account_create(String name,String dob,String address,String nic,String gender,String mobile,String email,String nationality,String acc_type,String int_pay){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
            String sql ="insert into acc_details (name,dob,address,nic,gender,mobile,email,nationality,acc_type,int_pay,balance) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psmt = con.prepareStatement(sql);
           
            
            psmt.setString(1, name);
            psmt.setString(2, dob);
            psmt.setString(3, address);
            psmt.setString(4, nic);
            psmt.setString(5, gender);
            psmt.setString(6, mobile);
            psmt.setString(7, email);
            psmt.setString(8, nationality);
            psmt.setString(9, acc_type);
            psmt.setString(10, int_pay);
            psmt.setString(11, int_pay);
            
            psmt.executeUpdate();
            result=1;
        }catch(Exception e){
            System.out.println(e);
            result=0;
        }
        return result;
    }
}
