package ch06.exam;

import java.util.Scanner;

public class BankApplication {
	public static Account[] account = new Account[100];
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("---------");
			
			if(n==1) {
				createAcc();
			}else if(n==2) {
				accList();
			}else if(n==3) {
				deposit();
			}else if(n==4) {
				withdraw();
			}else if(n==5) {
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println("유효하지 않은 입력입니다. 1~5를 입력하세요.");
			}
		}
	}
	public static void createAcc() {
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accNo = sc.nextLine();
		System.out.print("계좌주: ");
		String name = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		
		Account newAccount = new Account(accNo, name, balance);
		for(int i=0; i<account.length;i++) {
			if(account[i]==null) {
				account[i] = newAccount;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	public static void accList() {
		System.out.println("계좌목록");
		System.out.println("---------");
		for(int i=0; i<account.length;i++) {
			if(account[i]!=null) {
				System.out.println(account[i].getAccNo()+"\t"+account[i].getAccName()+"\t"+account[i].getBalance());
			}else {
				break;
			}
		}
	}
	public static void deposit() {
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accNo = sc.nextLine();
		System.out.print("예금액: ");
		int depMoney = Integer.parseInt(sc.nextLine());
		for(int i=0; i<account.length; i++) {
			if(account[i] != null && account[i].getAccNo().equals(accNo)) {
				System.out.println("조건식 true!");
				int newBalance = account[i].getBalance() + depMoney;
				account[i].setBalance(newBalance);
				break;
			}
		}
	}
	
//	//예금하기
//	private static void deposit() {
//	 System.out.println("--------------");
//	 System.out.println("예금");
//	 System.out.println("--------------");
//	 System.out.print("계좌번호: "); 
//	String ano = scanner.nextLine();
//	 System.out.print("예금액: ");
//	 int money = Integer.parseInt(scanner.nextLine());
//	 Account account = findAccount(ano);
//	 if(account == null) {
//	 System.out.println("결과: 계좌가 없습니다.");
//	 return;
//	 }
//	 account.setBalance(account.getBalance() + money);
//	 System.out.println("결과: 예금이 성공되었습니다.");
//	 }
	
//	//Account 배열에서 ano와 동일한 Account 객체 찾기
//	private static Account findAccount(String ano) {
//	 Account account = null;
//	 for(int i=0; i<accountArray.length; i++) {
//		 if(accountArray[i] != null) {
//			 String dbAno = accountArray[i].getAno();
//			 if(dbAno.equals(ano)) {
//				 ccount = accountArray[i];
//				 break;
//			 }
//		 	}
//	 	}
//	 	return account;
//	 }
	 
	
	public static void withdraw() { 
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accNo = sc.nextLine();
		System.out.print("출금액: ");
		int wdrBal = Integer.parseInt(sc.nextLine());
		for(int i=0; i<account.length; i++) {
			if(account[i] != null && account[i].getAccNo().equals(accNo)) {
				int newBalance =  account[i].getBalance() - wdrBal;
				account[i].setBalance(newBalance);
				break;
			}
		}
		System.out.println("결과: 출금이 성공되었습니다.");
	}
}
