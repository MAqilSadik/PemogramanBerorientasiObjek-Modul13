/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class RentalConsole2 extends Member {
       public static void main(String[] args) {
      
        Silver s = new Silver();
        Gold g = new Gold();
        Platinum p = new Platinum();
        Member m = new Member();
        
        insertMember();
        
       
        String idMember;
        int dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn;
        Scanner input = new Scanner(System.in);
    
        
        System.out.println(" Program Pengembalian Console Game Rental  ");
        
        System.out.print("\n Masukkan ID Member                : ");
        idMember = input.nextLine();
        
        System.out.print("\n Masukkan Tanggal Pinjam (1 - 31)  : ");
        dateRent = input.nextInt();
        
        System.out.print(" Masukkan Bulan Pinjam (1 - 12)    : ");
        monthRent = input.nextInt();
        
        System.out.print(" Masukkan Tahun Pinjam (xxxx)      : ");
        yearRent = input.nextInt();
        
        System.out.print("\n Masukkan Tanggal Kembali (1 - 31) : ");
        dateReturn = input.nextInt();
        
        System.out.print(" Masukkan Bulan Kembali (1 - 12)   : ");
        monthReturn = input.nextInt();
        
        System.out.print(" Masukkan Tahun Kembali (xxxx)     : ");
        yearReturn = input.nextInt();
        
        
      
  
        searchMember(idMember);
        
        

        System.out.println("\n| Tanggal Pinjam                   | : " + dateRent + " - " + monthRent + " - " + yearRent);
        System.out.println("| Tanggal Kembali                  | : " + dateReturn + " - " + monthReturn + " - " + yearReturn);
        
        
      
        int rentalDuration = rentDuration(dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn);
        System.out.println("| Lama Sewa                        | : " + rentalDuration + " hari");
        
        
   
        String jenisMember = getJenisMember(idMember);
        if(jenisMember == "Silver") {
            System.out.println("\n| Total Sewa                       | : Rp. " + s.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + s.getPoint(rentalDuration));
        
        } else if(jenisMember == "Gold") {
            System.out.println("\n| Total Sewa                       | : Rp. " + g.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + g.getPoint(rentalDuration));
            System.out.println("| Jumlah Cashback              | : Rp. " + g.getCashback());
            
        } else if(jenisMember == "Platinum") {
            System.out.println("\n| Total Sewa                       | : Rp. " + p.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + p.getPoint(rentalDuration));
            System.out.println("| Jumlah Cashback              | : Rp. " + p.getCashback());
            System.out.println("| Bonus Pulsa                  | : Rp. " + p.getBonus(rentalDuration));
            
        } else {
            System.out.println("");
        }
       }
}