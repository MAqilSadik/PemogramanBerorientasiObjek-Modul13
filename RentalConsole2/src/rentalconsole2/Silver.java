/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole2;

/**
 *
 * @author User
 */
public class Silver extends Member {
   private int rentCost, point, disc, tempCost, discountAmount, totalCost;
    
    public void setRentCost(int rc) {
        this.rentCost = rc;
    }
    
    public void setPoint(int p) {
        this.point = p;
    }
    
    public void setDisc(int d) {
        this.disc = d;
    }
    
    
     Silver() {
        setRentCost(25000);
        setPoint(1);
        setDisc(1);
    }
    
    protected int costAmount(int rentalDuration) {
        
        tempCost = rentalDuration * rentCost;
        discountAmount = (tempCost * disc) / 100;
        totalCost = tempCost - discountAmount;
        
        return totalCost;
    }
    
    protected int getPoint(int rentalDuration) {
        
        int totalPoint = rentalDuration * point;
        return totalPoint;
    }
}
    