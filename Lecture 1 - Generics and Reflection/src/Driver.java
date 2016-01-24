/**
 * Source class which code will enter.
 * 
 * @author James
 */
public class Driver {
    
    public static void main(String[] args){
        
        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();
        
        Class baCls = BankAccount.class;
        
        try{
            BankAccount myAccount = baCls.newInstance();
            aStorage.setValue(myAccount);
            
            // Deposit
            myAccount.deposit(15);
        }
        catch (InstantiationException e){}
        catch (IllegalAccessException e){}
        
    }
    
}