/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseController {
    public static Connection connectToDB() throws SQLException, ClassNotFoundException {
        Connection con;
            System.out.println("Loading the driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction_db","root","");
            System.out.println("Connected");
            return con;
    }
}
