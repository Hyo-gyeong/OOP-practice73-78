//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice78 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BankAccount b0 = new BankAccount("�赿��", 600, 3.1);
		BankAccount b1 = new BankAccount("ȫ�浿", 500, 2.15);
		BankAccount b2 = new BankAccount("������", 500, 2.05);
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println("\n���� "+b1.getAccountNo()+"���� ���� "+b2.getAccountNo()+"���� �۱��� �ݾ��� �Է��ϼ���: ");
		int send = input.nextInt();
		
		if (b1.transfer(b2, send)) {
			System.out.println("�۱��� �����߽��ϴ�.");
		}
		else {
			System.out.println("�۱��� �����߽��ϴ�.");
		}
		
		System.out.println();
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		input.close();
	}

}
