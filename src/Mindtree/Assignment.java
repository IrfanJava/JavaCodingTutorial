package Mindtree;
import java.util.*; 
public class Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Balance:");
		double bal=sc.nextDouble();
		System.out.println("Interest Rate:");
		int rate=sc.nextInt();
		System.out.println("Account No.:");
		int accno=sc.nextInt();
		SavingsAccount obj=new SavingsAccount(bal,rate,accno);
		System.out.println("Enter Amount to be Withdrawn");
		double amt=sc.nextDouble();
		obj.withDraw(amt);
		obj.calculateInterest();
	}
}
class SavingsAccount{
	private double balance;
	private int interestRate;
	private int accountNo;
	public SavingsAccount(){
	}
	public SavingsAccount(double balance,int interestRate,int accountNo) {
		this.balance=balance;
		this.interestRate=interestRate;
		this.accountNo=accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void withDraw(double amount) {
		if(amount>balance) {
			System.out.println("Error! amount entered is greater than available balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Successfully withdrawn "+amount);
			System.out.println("Available balance is "+balance);
		}
	}
	public void calculateInterest() {
		double interest=(balance*2*interestRate)/100;
		System.out.println("Interest is "+interest); 
	}
}
