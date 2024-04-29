package Programs;

public class StaticBlock1 {
	//Q. can we intialized member variables in static block
	//ans: yes we create object of class and call member varaibles 
	int age;
	static String name;
	static {
		StaticBlock1 s = new StaticBlock1();
		s.age = 25;
		name ="Tom";
		System.out.println(name+"  "+s.age);
	}

	public static void main(String[] args) {
		

	}

}
