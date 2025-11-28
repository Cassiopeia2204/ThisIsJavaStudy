package ch06.exam;

import java.util.Scanner;


/*
 * 객체는 잘 생성되지만 main 메소드를 재실행하면 ram에 있는 객체 데이터가 휘발성이라서 사라진다
 */



public class BankApplication3 {
	Account[] account = new Account[100];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankApplication3 bankApplication3 = new BankApplication3();
		
		System.out.println("---------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.print("선택> ");
		int in = Integer.parseInt(sc.nextLine());
//		int n = sc.nextInt(); 입력버퍼에 \n이 남아있으므로 계좌번호 입력할 때 \n이 들어가서 바로 계좌주로 넘어감. nextLine()을 쓰는 것이 적합
		System.out.println("---------");
		switch(in) {
		case 1 :
			System.out.println("계좌생성");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String accno = sc.nextLine();
			System.out.print("계좌주: ");
			String name = sc.nextLine();
			System.out.print("초기입금액: ");
			int bal = Integer.parseInt(sc.nextLine());
			bankApplication3.createAcc(accno, name, bal);
			System.out.println("결과: 계좌가 생성되었습니다.");
			bankApplication3.accList();
			break;
		case 2 :
			System.out.println("계좌목록");
			System.out.println("---------");
			bankApplication3.accList();
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
		Account newAccount = new Account(accno, name, bal);
		for(int i=0; i<account.length;i++) {
			if(account[i]==null) {
				account[i] = newAccount;
				break;
			}
		}
	}
	public void accList() {
		for(int i=0; i<account.length;i++) {
//			account[i] = new Account(); -> 정상적으로 생성된 객체들을 새로운 객체로 덮어쓰겠다는 뜻
			if(account[i]/*.getAccNo()*/ != null) {
				System.out.println(account[i].getAccNo()+"\t"+account[i].getAccName()+"\t"+account[i].getBalance());
			}
		}
	}
}
