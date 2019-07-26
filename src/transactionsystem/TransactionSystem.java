/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactionsystem;

import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class TransactionSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Controller.DatabaseController.connectToDB();
    }
    
}
