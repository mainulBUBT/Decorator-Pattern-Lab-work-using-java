/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs2;

/**
 *
 * @author MIHAN
 */
public class Labs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Burger beefBurger = new BeefBurger();
        System.out.println("Normal Burger Order:");
        beefBurger.payment();
        System.out.println();
        
        System.out.println("Extra Cheese Burger Order:");
        Burger beefBurger2 = new ExtraCheese(new BeefBurger());
        beefBurger2.payment();
        
        System.out.println("Extra Cheese Burger Order:");
        Burger turkeyBurger = new ExtraCheese(new TurkeyBurger());
        turkeyBurger.payment();
        
        
    
    }
    
}
