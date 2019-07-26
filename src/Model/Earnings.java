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
public class Earnings {
    int eaID;
    double eaAmount;
    String eaDescription, eaDate;

    public int getEaID() {
        return eaID;
    }

    public void setEaID(int eaID) {
        this.eaID = eaID;
    }

    public double getEaAmount() {
        return eaAmount;
    }

    public void setEaAmount(double eaAmount) {
        this.eaAmount = eaAmount;
    }

    public String getEaDescription() {
        return eaDescription;
    }

    public void setEaDescription(String eaDescription) {
        this.eaDescription = eaDescription;
    }

    public String getEaDate() {
        return eaDate;
    }

    public void setEaDate(String eaDate) {
        this.eaDate = eaDate;
    }
    
    
}
