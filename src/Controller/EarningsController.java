/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Earnings;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class EarningsController {
    
    public static int Insert(String description, String date, double amount ) throws SQLException, ClassNotFoundException{
        
        PreparedStatement stmt = null;
        Earnings e = new Earnings();
        e.setEaDescription(description);
        e.setEaDate(date);
        e.setEaAmount(amount);
        Connection con = DatabaseController.connectToDB();
        String queryString = "insert into earnings(EAdescription, EAamount,  EAdate) values (?, ?, ? )";
        stmt = con.prepareStatement(queryString);
        stmt.setString(1, e.getEaDescription());
        stmt.setDouble(2, e.getEaAmount());
        stmt.setString(3, e.getEaDate());
        int l = stmt.executeUpdate();
        return l;
    }
    
    public static void Delete(int a) throws SQLException, ClassNotFoundException{
        Connection con =DatabaseController.connectToDB();
        PreparedStatement stmt = null;
        String query = "delete from earnings where EAid = ?";
        stmt = con.prepareStatement(query);
        stmt.setInt(1,a);
        stmt.executeUpdate();
    }
    
    public static void Edit(String description, double amount, String date, String id) throws SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;
        String query = "update earnings set EAdescription = ?, EAamount = ? , EAdate where EAid = ?";
        stmt = DatabaseController.connectToDB().prepareStatement(query);
        stmt.setString(1, description);
        stmt.setDouble(2, amount);
        stmt.setString(3, date);
        stmt.executeUpdate();
    }
}
