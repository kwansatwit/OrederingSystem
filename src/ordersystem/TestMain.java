
import static java.lang.Character.isUpperCase;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Shuk Ha Kwan
 * 1/27/2022:
 * Class for testing only
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
    	String databaseName = "RestaurantManagementDB";
    	String userName = "root";
    	String password = "KaKIjttmEBwhIzzv";
    	
    	
    	DbConnection connection = new DbConnection(databaseName, userName, password);
    	Connection con = connection.openConnection();
    	

        Scanner input =  new Scanner(System.in);
        ArrayList<Double> amount = new ArrayList<Double>();
     /*   Calculation cal = new Calculation();
        double upperbound = 1500;
        Random rand = new Random();
        double r, sum = 0;
        System.out.println("Total: ");
        
        for (int i = 0; i < 10; i++) {
            r = Math.floor(rand.nextDouble()*100)/100;
            
            amount.add(r);
            sum += r;
            System.out.print(r + " ");
            
        }
        System.out.println("sum= " + sum + " ");

        double total = 0.0;
        total = cal.totalSale(amount);

        System.out.println("TestMain.main()" + total);

        double price = 0, sumTotal=0.0;
        while (price >= 0) {
            System.out.println("Add enter +, Subtract enter - ");
            System.out.print("Enter: ");            
            char c = input.next().charAt(0);
            System.out.print("price: ");
            price = input.nextDouble();
            if(c == '+'){        
            sumTotal = cal.addTotal(price);
            }else if(c== '-'){
               sumTotal = cal.subtractTotal(price);
            }else
            {
                System.out.println("Wrong Input! Enter again");
            }
             System.out.println("getTotal = "+ cal.getTotal());
        }
        */
     
     // testing for the password creator
      ComplexPassword pw = new ComplexPassword();
      boolean isPw = false;
      String pws = "";
      
      while(true){

         try{
          System.out.print("Enter PW: ");
          pws = input.nextLine();
          pw.setPassword(pws); 
          pw.validPassWord();

          
          
         }catch(Exception e){
             System.out.print("Here?");
             System.out.print(e.getMessage()+"\n");
             System.out.println(pw.errorMessage());   
   
        }
      }
       


    }

}
