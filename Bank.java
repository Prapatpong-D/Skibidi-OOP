
public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){
        this.acct = new Account[10];
        
    }
    public void addAccount(Account ac){
        if (this.numAcct < this.acct.length){
            acct[this.numAcct] = ac;
            this.numAcct += 1;
        }
    }
    
    public Account getAccount(int index){
        return this.acct[index];
    }
    
    public int getNumAccount(){
        return this.numAcct;
    }
}
