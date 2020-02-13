package emptyjavaproject;

import java.util.Scanner;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Currency dollars = new Currency("dollars", "$");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Initial Balance: ");
        Money balance = new Money(dollars, keyboard.nextLong());
        Account myAccount = new Account(balance);
        myAccount.printHistory();
    }
}

