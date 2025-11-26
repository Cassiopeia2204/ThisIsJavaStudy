package ch06.exam;

import java.util.Scanner;

public class BankApplication {
	Account[] account = new Account[100];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankApplication bankApplication = new BankApplication();
		
		System.out.println("---------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.print("선택> ");
		int n = sc.nextInt();
		System.out.println("---------");
		switch(n) {
		case 1 :
			System.out.println("계좌생성");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String accno = sc.next();
			System.out.print("계좌주: ");
			String name = sc.next();
			System.out.print("초기입금액: ");
			int bal = sc.nextInt();
			bankApplication.createAcc(accno, name, bal);
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
		case 2 :
			System.out.println("계좌목록");
			System.out.println("---------");
			bankApplication.accList();
			break;
		case 3 :
			System.out.println("예금");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String accno3 = sc.next();
			System.out.print("예금액: ");
			int dep = sc.nextInt();
			break;
		case 4 :
			System.out.println("출금");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String accno4 = sc.next();
			System.out.print("출금액: ");
			int wd = sc.nextInt();
			break;
		case 5 :
			break;
			
		}
	}
	
	public void createAcc(String accno, String name, int bal) {
		for(int i=0; i<account.length;i++) {
			account[i] = new Account(accno, name, bal);
		}
	}
	public void accList() {
		for(int i=0; i<account.length;i++) {
			account[i] = new Account();
			if(account[i].getAccNo() != null) {
				System.out.println(account[i].getAccNo()+"\t"+account[i].getAccName()+"\t"+account[i].getBalance());
			}
		}
	}
}
