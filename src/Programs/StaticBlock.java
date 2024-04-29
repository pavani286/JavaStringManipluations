package Programs;

public class StaticBlock {
  public static void main(String[] args) {
	  System.out.println(new test().x);
  }

}

class test{
	public final int x= 100;
	
	static {
		System.out.println("static block ...123");
	}
}