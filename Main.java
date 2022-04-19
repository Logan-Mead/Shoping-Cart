/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.lab_11;

/**
 *
 * @author loganmead
 */
public class Main {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.setTaxRate(0.08);
        
        Item keyboard = new Item("Keyboard", 9.99, 1);
        Item mouse = new Item("Mouse", 19.99, 1);
        Item monitor = new Item("Monitor", 110.00, 2);
        Item lysol = new Item("Lysol", 8.50, 5);
        Item handSanitizer = new Item("Hand Sanitizer", 15.00, 9);
        Item tioletPaper = new Item("Tiolet Paper", 9.99, 50);
        
        cart.addToCart(keyboard);
        cart.addToCart(mouse);
        cart.addToCart(monitor);
        cart.addToCart(lysol);
        cart.addToCart(handSanitizer);
        cart.addToCart(tioletPaper);
        
        System.out.printf("SubTotal: $%.2f\n", cart.getSubTotal());
        System.out.printf("Total: $%.2f\n", cart.getTotal());
    }
    
}
