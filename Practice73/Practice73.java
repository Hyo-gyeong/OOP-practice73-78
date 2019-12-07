//20190975 컴퓨터학과 신효경
public class Practice73 {

	public static void main(String[] args) {
		Student s = new Student(1111);
		Undergraduate u = new Undergraduate(3);
		Graduate g = new Graduate("SE");
		
		s.setTuition(100);
		s.setGpa(3.2);
		System.out.println(s.toString());
		System.out.println(u.toString());
		System.out.println(g.toString());
	}
}
