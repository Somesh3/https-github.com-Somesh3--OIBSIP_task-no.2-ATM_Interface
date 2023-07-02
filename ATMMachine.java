package ATMMachine;

import java.util.Scanner;

class ATM 
{
    float Balance=1000.00f;
    int pin=1423;


    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Sorry, please enter the valid pin: ");
        }
    }

    public void menu(){
        System.out.println("Welcome to The ATM");
        System.out.println("Choose 1 for check A/C Balance");
        System.out.println("Choose 2 for Deposit Money");
        System.out.println("Choose 3 for withdraw Money");
        System.out.println("Choose 4 for Exit");

         Scanner sc = new Scanner(System.in);
         int op = sc.nextInt();

         if(op==1){
            checkBalance();
         }
         else if(op==2){
            depositeMoney();
         }
         else if(op==3){
            withdrawMoney();
         }
         else if(op==4){
            return;
         }
         else{
            System.out.println("Sir please use a valid choice");
         }
    }
    public void checkBalance(){
        System.out.println(" Your A/C Balance is : " + Balance);
        menu();
        
    }

    public void depositeMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc= new Scanner(System.in);
        Float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Your money deposited Successfully");
        System.out.println("NOW YOUR A/C BALANCE IS: "  + Balance );
        menu();
    }
    public void withdrawMoney(){ 
        System.out.println("Enter the Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        Float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Sorry you do not withdrae this amount,your A/c have less Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println(" Money Withdraw Successful");
        }
        menu();
    }
}
 class ATMMachine{
      public static void main(String args[]){
        ATM op = new ATM();
        op.checkpin();

    }
}