//20190975 ��ǻ���а� ��ȿ��
import java.util.Scanner;
public class Practice74 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("box1�� ������ �Է��ϼ���.");
		System.out.print("����:");
		int x0 = input.nextInt();
		System.out.print("����:");
		int y0 = input.nextInt();
		System.out.print("����:");
		int z0 = input.nextInt();
		Box b0 = new Box(x0, y0, z0);
		
		System.out.println("\nbox2�� ������ �Է��ϼ���.");
		System.out.print("����:");
		int x1 = input.nextInt();
		System.out.print("����:");
		int y1 = input.nextInt();
		System.out.print("����:");
		int z1 = input.nextInt();
		System.out.print("����:");
		String m1 = input.next();
		MaterialBox b1 = new MaterialBox(x1, y1, z1, m1);
		
		System.out.println("\nbox3�� ������ �Է��ϼ���.");
		System.out.print("����:");
		int x2 = input.nextInt();
		System.out.print("����:");
		int y2 = input.nextInt();
		System.out.print("����:");
		int z2 = input.nextInt();
		System.out.print("����:");
		String m2 = input.next();
		MaterialBox b2 = new MaterialBox(x2, y2, z2, m2);
		
		System.out.println("\nbox1�� �����Դϴ�.");
		System.out.print(b0.toString());
		
		System.out.println("\n\nbox2�� �����Դϴ�.");
		System.out.print(b1.toString());
		
		System.out.println("\n\nbox3�� �����Դϴ�.");
		System.out.print(b2.toString());
		
		input.close();
	}

}
