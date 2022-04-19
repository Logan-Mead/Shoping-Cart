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
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private double salesTaxRate;
    
    public ShoppingCart(){
        items = new ArrayList<Item>();
    }
    
    public void addToCart(Item item){
        items.add(item);
    }
    
    public double getSubTotal(){
        double subTotal = 0;
            for(int i=0; i<items.size(); i++){
                subTotal = subTotal + (items.get(i).getPrice() * items.get(i).getQuantity());
            }
            return subTotal;
    }
    
    public void setTaxRate(double salesTaxRate){
        this.salesTaxRate = salesTaxRate;
    }
    
    public double getSalesTaxRate(){
        return salesTaxRate;
    }
    
    public double getTotal(){
        double total;
        total = getSubTotal() + (getSubTotal() * getSalesTaxRate());
        return total;
    }
}
