//��ǻ���а� 20190975 ��ȿ��
import java.util.Random;
public class BankAccount {

	Random rn = new Random();
	
	private String name, accountNo; 
	private int balance; 
	private double interest;

	public void setName(String name) {this.name = name; }
	public String getName() {return name;}
	
	public void setAccountNo(String accountNo){this.accountNo = makeID(); }
	public String getAccountNo() { return accountNo;}
	
	public void setBalance(int balance){this.balance = balance; }
	public int getBalance () { return balance; }
	
	public void setInterest(double interest){this.interest = interest; }
	public double getInterest() {return interest;}
	
	
	 public BankAccount(String name, int balance, double interest) {
		 this.name = name;
		 this.accountNo = makeID();
		 this.balance = balance;
		 this.interest = interest;
	 }
	 public int calcInterest(int balance, double interest) {
		 return (int)(balance*interest/100);
	 }
	 
	 public String makeID() {
		 int s1 = rn.nextInt(1000)+1000;
		 int s2 = rn.nextInt(1000)+1000;
		 this.accountNo = s1+"-"+s2;
		 return accountNo;
	 }
	 
	 public boolean deposit(int money) {
		 if (money >= 0)
			 return true;
		 else
			 return false;
	 }
	 public boolean withdraw(int money) {
		 if (money <= balance)
			 return true;
		 else
			 return false;
	 }
	 
	 public boolean transfer(BankAccount otherAccount, int amount)  {
		 if (withdraw(amount) == true && deposit(amount) == true) {
			 balance -= amount;
			 otherAccount.balance += amount;
			 return true;
		 }
		 else {
			 return false;
		 }	 
	 }
	 	
	 public String toString()   
	 {
		 return accountNo+" :: "+name+" :: "+balance+"�� :: "+interest+"%";
	 } 
}
