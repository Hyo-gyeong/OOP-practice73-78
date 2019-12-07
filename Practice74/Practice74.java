//20190975 컴퓨터학과 신효경
import java.util.Scanner;
public class Practice74 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("box1의 정보를 입력하세요.");
		System.out.print("가로:");
		int x0 = input.nextInt();
		System.out.print("세로:");
		int y0 = input.nextInt();
		System.out.print("높이:");
		int z0 = input.nextInt();
		Box b0 = new Box(x0, y0, z0);
		
		System.out.println("\nbox2의 정보를 입력하세요.");
		System.out.print("가로:");
		int x1 = input.nextInt();
		System.out.print("세로:");
		int y1 = input.nextInt();
		System.out.print("높이:");
		int z1 = input.nextInt();
		System.out.print("재질:");
		String m1 = input.next();
		MaterialBox b1 = new MaterialBox(x1, y1, z1, m1);
		
		System.out.println("\nbox3의 정보를 입력하세요.");
		System.out.print("가로:");
		int x2 = input.nextInt();
		System.out.print("세로:");
		int y2 = input.nextInt();
		System.out.print("높이:");
		int z2 = input.nextInt();
		System.out.print("재질:");
		String m2 = input.next();
		MaterialBox b2 = new MaterialBox(x2, y2, z2, m2);
		
		System.out.println("\nbox1의 정보입니다.");
		System.out.print(b0.toString());
		
		System.out.println("\n\nbox2의 정보입니다.");
		System.out.print(b1.toString());
		
		System.out.println("\n\nbox3의 정보입니다.");
		System.out.print(b2.toString());
		
		input.close();
	}

}
