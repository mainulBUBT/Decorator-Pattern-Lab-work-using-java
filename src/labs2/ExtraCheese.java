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
public class ExtraCheese extends BurgerDecorator {
    
    public ExtraCheese(Burger decorateBurger) {
        super(decorateBurger);
    }
    
    @Override
    public void payment(){
        decorateBurger.payment();
        System.out.println("With Extra Chees Bill (+100): "+(decorateBurger.price()+100));
    }
}
