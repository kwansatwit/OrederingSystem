
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shuk Ha Kwan
 * 
 * 1/27/22: 
 * Created Class for calculate bills and sales report - Ha
 */
public class Calculation {
    double total, price;
    
    /**
     * default constructor
     * initialize price and total to be 0
     */
    Calculation(){
         price = 0;      
         total = 0;
    }    
    
    /**
     * Constructor with one argument 
     * @param price 
     */
    Calculation(double price){
        this.price = price;
    }
    
    /**
     * added price each time and updated the total prices
     * @param price
     * @return the sum of price 
     */
    double addTotal(double price)
    {
        return total += price;
    }
    
    /**
     * subtract price each time and updated the total prices
     * @param price
     * @return the sum of price
     */
    double subtractTotal(double price){
        
        return total -= price;
    }
    
    /**
     * 
     * @return total price
     */
    double getTotal(){
        return total;
    }
    
    /**
     * 
     * @param sales - an arraylist contained all the sales value as double
     * the arraylist passed from gui, which come from database
     * @return a sum of all sales value
     */
   double totalSale(ArrayList<Double> sales){
      return sales.stream().mapToDouble(Double::doubleValue).sum();
   }
    
    
    
}
