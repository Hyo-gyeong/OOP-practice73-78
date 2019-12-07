//20190975 컴퓨터학과 신효경
import java.util.Scanner;
public class Practice76 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형1의 가로를 입력:");
		int w1 = input.nextInt();
		System.out.print("사각형1의 세로를 입력:");
		int h1 = input.nextInt();
		Rectangle r1 = new Rectangle(w1, h1);
		
		System.out.print("사각형2의 가로를 입력:");
		int w2 = input.nextInt();
		System.out.print("사각형2의 세로를 입력:");
		int h2 = input.nextInt();
		Rectangle r2 = new Rectangle(w2, h2);
		
		if (r1.isSmallerThan(r2) == r2.isSmallerThan(r1)) {
			System.out.print("두 사각형의 넓이는 같습니다.");
		}
		else if (r1.isSmallerThan(r2)){
			System.out.print("사각형2이 넓이가 더 작습니다.");
		}
		else {
			System.out.print("사각형1이 넓이가 더 작습니다.");
		}
		
		input.close();
	}

}
