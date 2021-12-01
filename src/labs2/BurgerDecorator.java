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
public abstract class BurgerDecorator implements Burger {
    protected Burger decorateBurger;
    
    public BurgerDecorator(Burger decorateBurger){
        this.decorateBurger = decorateBurger;
    }
    
    @Override
    public void payment(){
        decorateBurger.payment();
    }
    @Override
    public int price() {
        return decorateBurger.price();
    }

}
