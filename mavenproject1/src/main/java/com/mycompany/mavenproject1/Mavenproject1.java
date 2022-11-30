/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres")) {
         if(conn==null) {
         System.out.print("Failed to connect");  
         return;
        }
          String sql =
                  " CREATE TABLE IF NOT EXISTS factory("
                  + "factory_id SERIAL PRIMARY KEY,"
                  + "factory_name TEXT ,"
                  + "FACTORY_num int);";
            Statement statement = conn.createStatement();
            statement.execute(sql);
            sql= " CREATE TABLE IF NOT EXISTS shop("
                    + "shop_id  int PRIMARY KEY,"
                    + "shop_name VARCHAR(20),"
                    + "shop_adress VARCHAR(30));";
            statement.execute(sql);
            statement.close();
            conn.close();
    }   catch (SQLException ex) {
            Logger.getLogger(Mavenproject1.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
