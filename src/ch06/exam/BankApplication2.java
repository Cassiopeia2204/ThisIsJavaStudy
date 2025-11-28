package ch06.exam;



/*
 * nextInt()가 정수 n를 읽고 입력 버퍼에 사용자가 엔터 친 개행 문자(\n)가 남는다.
 * 바로 다음 줄에 next()에는 입력 버퍼에 남아있는 개행 문자를 읽어버려서 아무것도 입력 받지 못하고 바로 다음 행으로 넘어간다.
 */



import java.util.Scanner;

public class BankApplication2 {
	
	Account[] account = new Account[100];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankApplication2 bankApplication2 = new BankApplication2();
		
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
			bankApplication2.createAcc(accno, name, bal);
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
		case 2 :
			System.out.println("계좌목록");
			System.out.println("---------");
			bankApplication2.accList();
			break;
		case 3 :
			System.out.println("예금");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String accno3 = sc.next();
			System.out.print("예금액: ");
			int dep = sc.nextInt();
			bankApplication2.deposit(accno3, dep);
			break;
		case 4 :
			System.out.println("출금");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String accno4 = sc.next();
			System.out.print("출금액: ");
			int wd = sc.nextInt();
			bankApplication2.withdraw(accno4, wd);
			break;
		case 5 :
			break;
			
		}
	}
	void createAcc(String accno, String name, int bal) {
		for(int i=0; i<account.length;i++) {
			account[i] = new Account();
			account[i].setAccNo(accno);
			account[i].setAccName(name);
			account[i].setBalance(bal);
		}
		return;
	}
	void accList() {
		for(int i=0; i<account.length;i++) {
			account[i] = new Account();
			System.out.println(account[i].getAccNo()+"\t"+account[i].getAccName()+"\t"+account[i].getBalance());
		}
	}
	void deposit(String accno3, int dep) {
		for(int i=0; i<account.length;i++) {
			account[i] = new Account();
			if(account[i].getAccNo() == accno3) {
				int depo = account[i].getBalance() + dep;
				account[i].setBalance(depo);
			}
		}
	}
	void withdraw(String accno4, int wd) {
		for(int i=0; i<account.length;i++) {
			account[i] = new Account();
			if(account[i].getAccNo() == accno4) {
				int depo = account[i].getBalance() - wd;
				account[i].setBalance(depo);
			}
		}
	}
}
