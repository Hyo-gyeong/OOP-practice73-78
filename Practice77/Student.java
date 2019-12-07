//컴퓨터학과 20190975 신효경
public class Student {
	private int id, tuition;
	private double gpa;
	private String name, major;
	
	int getId() {return id;}
	void setTuition(int tuition) { this.tuition = tuition;}
	int getTuition() {return tuition;}
	void setGpa(double gpa) { this.gpa = gpa;}
	double getGpa() { return gpa; }
	
	Student(){//초기화
		this.id = 0;
		this.tuition = 0;
		this.gpa = 0;
	}
	Student(int id) {
		this.id = id;
	}
	Student(int id, int tuition, double gpa){
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	Student(int id, String name, String major){
		this.id = id;
		this.name = name;
		this.major = major;
	}
	public int calcScholarship() {
		return (int)(getTuition() * 0.3);
	}
	public boolean isTheSame(Student s) {
		if (s.id == id)
			return true;
		else return false;
	}
	public String toString() {
		return getId()+"/"+name+"/"+major+"\n";
	}
}
