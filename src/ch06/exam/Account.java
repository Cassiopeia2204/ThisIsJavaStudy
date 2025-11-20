package ch06.exam;

public class Account {
	
	//19번
//	private static final int MAX_BALANCE = 1000000;
//	private static final int MIN_BALANCE = 0;
//	private int balance;
//	
////	public Account(int balance) {
////		this.balance = balance;
////	}
//	
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(int balance) {
//		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE ) {
//			this.balance = balance;
//		}else {
//			this.balance = getBalance();
//		}
//	}
	//20번
	
	public String accNo;
	public String accName;
	public int balance;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance > 0) {
			this.balance = balance;
		}else {
			this.balance = getBalance();
		}
	}
	
	
	
}
