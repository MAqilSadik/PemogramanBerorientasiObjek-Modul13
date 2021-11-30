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
public class Platinum extends Gold {
     private int bonus;
    
    Platinum() {
        setRentCost(45000);
        setPoint(10);
        setDisc(3);
        setCashback(10000);
    }
   
    public int getBonus(int rentalDuration) {
        
        this.bonus = rentalDuration * 5000;
        return bonus;
    }

}
