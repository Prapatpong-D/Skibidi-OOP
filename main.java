public class main{
public static void main(String[] args) {
     Account a1 = new Account(5000, "Sommai");
     Account a2 = new Account(3000, "Somchai");
     Account a3 = new Account(900, "Somsri");
     Account a4 = new Account(13, "tobynaja");

     Bank myBank = new Bank();
     myBank.addAccount(a1);
     myBank.addAccount(a2);
     myBank.addAccount(a3);
     myBank.addAccount(a4);
     
     // so important mak mak na i index when you use obj and list check deedee

     System.out.println("Number of Account: " + myBank.getNumAccount());
     myBank.getAccount(3).showAccount();
     myBank.getAccount(3).withdraw(13);
     myBank.getAccount(3).showAccount();
     System.out.println("Show all accounts");
     System.out.println("==============================");
     for(int i=0; i<myBank.getNumAccount(); i++){
     myBank.getAccount(i).showAccount();
 }
}
}