//20190975 ��ǻ���а� ��ȿ��
import java.util.Scanner;
public class Practice76 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�簢��1�� ���θ� �Է�:");
		int w1 = input.nextInt();
		System.out.print("�簢��1�� ���θ� �Է�:");
		int h1 = input.nextInt();
		Rectangle r1 = new Rectangle(w1, h1);
		
		System.out.print("�簢��2�� ���θ� �Է�:");
		int w2 = input.nextInt();
		System.out.print("�簢��2�� ���θ� �Է�:");
		int h2 = input.nextInt();
		Rectangle r2 = new Rectangle(w2, h2);
		
		if (r1.isSmallerThan(r2) == r2.isSmallerThan(r1)) {
			System.out.print("�� �簢���� ���̴� �����ϴ�.");
		}
		else if (r1.isSmallerThan(r2)){
			System.out.print("�簢��2�� ���̰� �� �۽��ϴ�.");
		}
		else {
			System.out.print("�簢��1�� ���̰� �� �۽��ϴ�.");
		}
		
		input.close();
	}

}
