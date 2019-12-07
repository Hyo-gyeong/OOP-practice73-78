//20190975 컴퓨터학과 신효경	
import java.util.Scanner;
public class Practice75 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BodyData me = new BodyData();
		BodyData you = new BodyData();
		
		System.out.print("내 키를 입력하세요:");
		me.setHeight(input.nextInt());
		System.out.print("내 몸무게를 입력하세요:");
		me.setWeight(input.nextInt());
		
		System.out.print("\n당신의 키를 입력하세요:");
		you.setHeight(input.nextInt());
		System.out.print("당신의 몸무게를 입력하세요:");
		you.setWeight(input.nextInt());
		
		if (me.isTallerThan(you) == true) {
			System.out.println("\n키는 내가 더 큽니다.");
		}
		else {
			System.out.println("\n키는 당신이 더 큽니다.");
		}		
		
		if (me.needDiet() == true){
			System.out.println("나는 다이어트가 필요합니다.");
		}
		else {
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		}
		
		if (you.needDiet() == true){
			System.out.println("당신은 다이어트가 필요합니다.");
		}
		else {
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		}
			
		input.close();
	}

}
