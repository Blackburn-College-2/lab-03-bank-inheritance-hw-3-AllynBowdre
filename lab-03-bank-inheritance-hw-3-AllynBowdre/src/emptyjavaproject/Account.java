package emptyjavaproject;

import java.util.ArrayList;

/**
 *
 * @author allyn
 */
public class Account {
    private Money balance;
    private ArrayList<Money> history;
    
    public Account(Money balance){
        this.history = new ArrayList<>();
        this.balance = balance;
        
    }

    
    public void withdraw(Money m){
         balance = balance.subtract(m);
        
        history.add(balance);
    }

    
    public void deposit (Money m){
         balance = balance.add(m);
        balance.setAmountNeg();
        history.add(balance);
    }

    
    public Money getBalance(){
        return balance;
        
    }
   
    
    public void printHistory(){
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i).getAmountString());
        }
    }
    
    @Override
    public String toString(){
        return balance.getAmountString();
    }
}
