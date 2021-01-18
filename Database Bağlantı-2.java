/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
 

import java.sql.*;

public class dbconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public dbconnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","root");
            st = con.createStatement();
            
            
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public void getData(){
        try{
            String query="Select *from tablo1";
            rs =st.executeQuery(query);
            System.out.println("Database Kaydedildi");
            while(rs.next()){
                String isim=rs.getString("isim");
                String soyisim=rs.getString("soyisim");
                System.out.println("İsim = "+isim+"  "+"Soyisim = "+soyisim);
                
            }
            
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
