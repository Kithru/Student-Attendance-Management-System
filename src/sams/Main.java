/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sams;

import sams.db.DBConnection;
import java.sql.SQLException;
import sams.view.Login;
import sams.view.Searchprogram;
import sams.view.Signup;
import sams.view.Batch;

/**
 *
 * @author kithruV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        new Searchprogram().setVisible(true);
        new Signup().setVisible(true);
//        new Batch().setVisible(true);
        
    }
    
}
