package ch06.exam;

public class Account {
	private static final int MAX_BALANCE = 1000000;
	private static final int MIN_BALANCE = 0;
	private int balance;
	
//	public Account(int balance) {
//		this.balance = balance;
//	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE ) {
			this.balance = balance;
		}else {
			this.balance = getBalance();
		}
	}
}
