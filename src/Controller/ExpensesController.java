/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Earnings;
import Model.Expenses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class ExpensesController {
    public static int Insert(String description, double amount, String category, String date, String vid) throws SQLException, ClassNotFoundException{
        
        PreparedStatement stmt = null;
        Expenses e = new Expenses();
        e.seteDescription(description);
        e.seteAmount(amount);
        e.seteCategory(category);
        e.seteDate(date);
        e.seteVoucherID(vid);
        Connection con = DatabaseController.connectToDB();
        String queryString = "insert into expenses(Edescription, Eamount, Ecategory, Edate, Evoucherid) values (?, ?, ?, ?, ? )";
        stmt = con.prepareStatement(queryString);
        stmt.setString(1, e.geteDescription());
        stmt.setDouble(2, e.geteAmount());
        stmt.setString(3, e.geteCategory());
        stmt.setString(4, e.geteDate());
        stmt.setString(5, e.geteVoucherID());
        int l = stmt.executeUpdate();
        return l;
        
    }
    
    public static void Delete(int a) throws SQLException, ClassNotFoundException{
        
        Connection con =DatabaseController.connectToDB();
        PreparedStatement stmt = null;
        String query = "delete from expenses where Eid = ?";
        stmt = con.prepareStatement(query);
        stmt.setInt(1,a);
        stmt.executeUpdate();
        
    }
    
    public static Integer selectMax() throws SQLException, ClassNotFoundException {
//        Connection con = DatabaseController.connectToDB();
//        PreparedStatement stmt = null;
//        String query = "select max (Eid) from expenses";
//        stmt = con.prepareStatement(query);
//        stmt.setInt(1, a);
//        stmt.executeUpdate();
        
        PreparedStatement stmt = null;
        Integer maxid = 0;
        Connection con =DatabaseController.connectToDB();
        String query = "select max(Eid) as maximum from expenses";
        stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
            maxid = rs.getInt("maximum");
        }
        return maxid;
    } 
    
    public static void Edit(String description, double amount, String category, String date, String vid, String id) throws SQLException, ClassNotFoundException {
        
        PreparedStatement stmt = null;
        String query = "update expenses set Edecription = ? , Eamount = ? , Ecategory = ? , Edate = ? , Evoucherid = ? where Eid = ?";
        stmt = DatabaseController.connectToDB().prepareStatement(query);
        stmt.setString(1, description);
        stmt.setDouble(2, amount);
        stmt.setString(3, category);
        stmt.setString(4, date);
        stmt.setString(5, vid);
        stmt.setString(6, id);
        stmt.executeUpdate();
        
    }
    
    
}
