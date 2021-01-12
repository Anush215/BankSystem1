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
public class db_connection {
    
    public void newconnection(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "");
                  
                   
        }catch(Exception e){
                    System.out.println(e);
        }
    }
}
