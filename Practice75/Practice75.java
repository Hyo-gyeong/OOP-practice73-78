//20190975 ��ǻ���а� ��ȿ��	
import java.util.Scanner;
public class Practice75 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BodyData me = new BodyData();
		BodyData you = new BodyData();
		
		System.out.print("�� Ű�� �Է��ϼ���:");
		me.setHeight(input.nextInt());
		System.out.print("�� �����Ը� �Է��ϼ���:");
		me.setWeight(input.nextInt());
		
		System.out.print("\n����� Ű�� �Է��ϼ���:");
		you.setHeight(input.nextInt());
		System.out.print("����� �����Ը� �Է��ϼ���:");
		you.setWeight(input.nextInt());
		
		if (me.isTallerThan(you) == true) {
			System.out.println("\nŰ�� ���� �� Ů�ϴ�.");
		}
		else {
			System.out.println("\nŰ�� ����� �� Ů�ϴ�.");
		}		
		
		if (me.needDiet() == true){
			System.out.println("���� ���̾�Ʈ�� �ʿ��մϴ�.");
		}
		else {
			System.out.println("���� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		}
		
		if (you.needDiet() == true){
			System.out.println("����� ���̾�Ʈ�� �ʿ��մϴ�.");
		}
		else {
			System.out.println("����� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		}
			
		input.close();
	}

}
