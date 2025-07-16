/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sams;

import sams.db.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author kithruV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // TODO code application logic here
        DBConnection.getInstance().getConnection();
        
    }
    
}
