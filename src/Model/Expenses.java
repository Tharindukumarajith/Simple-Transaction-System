/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dell
 */
public class Expenses {
    int eID;
    double eAmount;
    String eDescription, eCategory, eVoucherID, eDate;

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public double geteAmount() {
        return eAmount;
    }

    public void seteAmount(double eAmount) {
        this.eAmount = eAmount;
    }

    public String geteDescription() {
        return eDescription;
    }

    public void seteDescription(String eDescription) {
        this.eDescription = eDescription;
    }

    public String geteCategory() {
        return eCategory;
    }

    public void seteCategory(String eCategory) {
        this.eCategory = eCategory;
    }

    public String geteVoucherID() {
        return eVoucherID;
    }

    public void seteVoucherID(String eVoucherID) {
        this.eVoucherID = eVoucherID;
    }

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }
    
    
    
}
