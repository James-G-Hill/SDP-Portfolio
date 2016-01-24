/**
 * BankAccount class provided by Birkbeck DCS.
 * 
 * @author James
 */
class BankAccount {
    
    private float balance;
    
    public void deposit(float amount){
        this.balance += amount;
    }
    
    public float showBalance(){
        return this.balance;
    }
    
    BankAccount(){
        balance = 100;
    }
    
}