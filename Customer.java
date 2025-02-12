
import java.util.*;


public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    //private Account acct;
    private int numOfAccount;
    
    public Customer(){
            this("","",null);
            acct = new ArrayList();
            //this.acct = new Account[5];
    }
        
    public Customer(String firstName, String lastName){
        this(firstName,lastName,null);
        acct = new ArrayList();
        //this.acct = new Account[5];
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        //this.acct = acct;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    void addAccount(Account acct) {
        this.acct.add(acct);
        //this.acct[this.numOfAccount] = acct;
        this.numOfAccount += 1;
    }
    
    public Account getAccount(int index){
        return this.acct.get(index);
        //return this.acct[index];
    }
    
    @Override
    public String toString(){
        return this.firstName +" "+ this.lastName + " "+ this.numOfAccount + " accounts.";
    }

    int getNumOfAccount() {
        return this.acct.size();
        //return this.numOfAccount;
    }
}
