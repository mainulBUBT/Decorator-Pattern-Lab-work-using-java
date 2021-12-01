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
public class BeefBurger implements Burger {
    int price = 200;
    @Override
    public void payment() {
        System.out.println("Burger name: Beef Burger only 200 Taka");
    }

    @Override
    public int price() {
        return price;
    }

}
