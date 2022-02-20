/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shuk Ha Kwan
 */
public class Account {
    
    private String account, password;
   
    
    Account(){
        account ="";
        password = "";        
    }
    Account(String account, String password){
        this.account = account;
        this.password = password;
    }
    
    public String generateAccount(DbConnection db){
        String account = "";
        boolean isAccount = false;
        
        while(!isAccount){
          
            // get account number from db
            // and add 1 to the number of account and return it
            
        }      
        
        return account;
    }
    
    public String generatePW(){
        String pw = "";
        for(int i = 0; i < 3; i++)
        {
            pw+= (char)Math.floor(Math.random()*(57-48+1)+48);
            pw+= (char)Math.floor(Math.random()*(38-33+1)+33);
            pw+= (char)Math.floor(Math.random()*(90-63+1)+63);
            pw+= (char)Math.floor(Math.random()*(122-97+1)+97);
            
        }
        
        return pw;
    }
}
