/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    public static Connection connectTODB(){
    try{
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");
    return con;
    }
    catch(SQLException ex){
    Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE,null,ex);
    return null;
    }
    }
}
