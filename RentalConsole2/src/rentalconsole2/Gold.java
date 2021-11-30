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
public class Gold extends Silver {
    private int cashback;
    
    public void setCashback(int cb) {
        this.cashback = cb;
    }
    
    public int getCashback() {
        return this.cashback;
    }
    
    Gold() {
        setRentCost(30000);
        setPoint(5);
        setDisc(2);
        setCashback(5000);
    }
}
