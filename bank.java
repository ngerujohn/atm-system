import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float balance = 5000;
        int sec = 1234;
        int attempts = 3;
        boolean loggedIn = false;


       //PIN VERIFICATION
        while (attempts > 0) {
          System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
          System.out.println("JONTEZ ATM BANKING SYSTEM");
          System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
          System.out.print("Enter PIN:");
          int pin = input.nextInt();
          if (pin == sec) {
            loggedIn = true;
            break;
          }
          else{
            attempts--;
            System.out.println("Wrong PIN!");
          }
          if (attempts > 0) {
            System.out.println("Attempts remaining:"+attempts);
          }
          else{
            System.out.println("Account Locked!");
          }
        }

       //BANKING SYSTEM

           if (loggedIn) {
              while (true) {
                System.out.println();
                System.out.println("1.Check Balance");
                System.out.println("2.Deposit Cash");
                 System.out.println("3.Withdraw Cash");
                 System.out.println("4.Change pin");
                 System.out.println("5.Exit");
        
                  System.out.print("Enter choice:");
                  int choice = input.nextInt();

                if (choice == 1) {
                System.out.println("Balance is:"+balance);
                 }
    
                else if (choice == 2) {
                  System.out.print("Enter amount to deposit:");
                  float amount = input.nextFloat();
                  if (amount > 0) {
                    balance += amount;
                   System.out.print(amount+"deposited successfuly!Balance:"+balance);
                    }
                  else{
                    System.out.print("Invalid amount!");
                   }
                 }
        
                else if (choice == 3){
                  System.out.print("Enter amount to withdraw:");
                  float amount = input.nextFloat();
                 
                   if (amount > balance) {
                    System.out.println("Insufficient funds!!");
                   }
                  else if (amount < balance){
                     balance-=amount;
                   System.out.print(amount+"withdrawn successfully!Balance:"+balance);

                 }
                   else{
                   System.out.print("Invalid amount!");
                  }
                   }
                else if(choice == 4){
                  System.out.print("Enter old PIN:");
                  int pin = input.nextInt();

                  if (pin == sec) {
                    System.out.print("Enter new PIN:");
                    int newPin = input.nextInt();
                    System.err.println("PIN changed successfully!Your new PIN is:"+newPin);
                  }
                  else{
                    System.out.println("Error! Enter a valid pin!");
                  }
                }
                else if (choice == 5){
                System.out.println("Thank you for banking with us!!Have a nice time...");
                break;
               }
                else{
               System.out.println("Invalid choice!Try again!!");
                 }
              }
            }
          }
        }
    
               
              



        

      
  
          
          
        

       

        
      
      
  
       
        
        
    
        

           


