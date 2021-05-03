package Practice1;

class Student{
	int rollnum;
	String name;
	
	 Student(int r, String n) {
		rollnum=r;
		name=n;
		System.out.println("Calling default constructor");
	}
	void info() {
		System.out.println("Roll Number = "+ rollnum +"  Name = "+ name);
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		Student st=new Student(110, "Vedan");
		//st.insert(110, "Vedan");
		//st.info();

	}

}
