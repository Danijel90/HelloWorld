package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.println("Danijel Minic");
        
        int age = 5;
        
        if (age > 18) {
            System.out.println("Osoba je Punoletna");
        } else {
             System.out.println("Osoba je Maloletna");
        }
        System.out.println("Unesite broj godina");
        Scanner input = new Scanner (System.in);
        
        int userAge = input.nextInt();
        
        
        System.out.println("Korisnik je uneo : " + userAge);
           if (userAge > 18) {
            System.out.println("Osoba je Punoletna");
        } else {
             System.out.println("Osoba je Maloletna");
        
             
               System.out.println("..............................."); 
               
               System.out.println("Unesite broj godina");
               Scanner input2 = new Scanner(System.in);
           
               int personAge = input2.nextInt();
                
               
               if (personAge <= 0) {
                   System.out.println("Invalid");
                 }
               else if (personAge <=5)    
                        if (personAge <= 0) {
                   System.out.println("Baby");
                 }
               else if (personAge <=11)    
                                  if (personAge <= 0) {
                   System.out.println("Kid");
                 }
               else if (personAge <=17)    
                        if (personAge <= 0)
                              
                           
                           
                           
                           
                 
                       
                       
                       
                       
                       
                       
                       
               
               
             
        
        }

    }

}
    
           
    
           
    
    

