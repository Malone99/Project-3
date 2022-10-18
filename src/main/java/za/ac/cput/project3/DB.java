/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.project3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author methysmacbookpro32
 */
public class DB {
      Connection con;
    PreparedStatement statement;

    public Connection connectDB() throws SQLException {

        // Connection con;  
        String url="jdbc:derby://localhost:1527/Tutorial";
        String username = "Tutorial";
        String password = "Tutorial";

        DriverManager.getConnection(url, username, password);

        return DriverManager.getConnection(url, username, password);

    }
    
private void DatabaseSTUDENTS() {
            System.out.println("DB");
            String STUDENT_SQL = "CREATE TABLE APP.STUDENTS ("
                    + "StudentID INT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 200110210, INCREMENT BY 7), "
                    
                    + "first_Name VARCHAR(255), last_name VARCHAR(255),"
                    
                    + "Email VARCHAR(255), password VARCHAR(255), "
                    
                    + "phone_number VARCHAR(255), gender VARCHAR(255), address VARCHAR(255), "
                    
                    + "country VARCHAR(255))";
            
            try{
                System.out.println(" about to get the connection.......");
                
                con=connectDB();
                System.out.println("connection  Establishi...............");
                statement=con.prepareStatement(STUDENT_SQL);
                System.out.println("Table Created...............");
                statement.execute();
                System.out.println("Executing Sucessfully...............");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
} 
public regiserWorker InsertAnswerQuestion(regiserWorker register) throws SQLException 
{
   String MESS= "INSERT INTO APP.STUDENTS ( first_Name  , last_name , Email , password, phone_number , gender , address , country) " + " VALUES (?,?,?,?,?,?,?,?)";
   con=connectDB();
   System.out.println("connection successful");
        statement = con.prepareStatement(MESS); 
        statement.setString(1, register.getFirstName());
        statement.setString(2, register.getLastname());
        statement.setString(3, register.getEmail());
        statement.setString(4, register.getPassword());
        statement.setString(5, register.getMobile());
        statement.setString(6, register.getGender());
        statement.setString(7, register.getAddress());
        statement.setString(8, register.getCountry());
        int rowINserted = statement.executeUpdate();
        if (rowINserted > 0) {
            System.out.println("insertion successfull");
        }
        statement.close();
    
    return register;
}
  public static void main(String[] args)  {
  
    DB db=new DB();
      db.DatabaseSTUDENTS();
  
  }
}
