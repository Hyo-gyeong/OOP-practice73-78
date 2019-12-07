//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice78 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BankAccount b0 = new BankAccount("김동덕", 600, 3.1);
		BankAccount b1 = new BankAccount("홍길동", 500, 2.15);
		BankAccount b2 = new BankAccount("성춘향", 500, 2.05);
		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println("\n계좌 "+b1.getAccountNo()+"에서 계좌 "+b2.getAccountNo()+"으로 송금할 금액을 입력하세요: ");
		int send = input.nextInt();
		
		if (b1.transfer(b2, send)) {
			System.out.println("송금이 성공했습니다.");
		}
		else {
			System.out.println("송금이 실패했습니다.");
		}
		
		System.out.println();
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		input.close();
	}

}
