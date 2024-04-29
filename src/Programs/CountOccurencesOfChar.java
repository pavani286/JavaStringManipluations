package Programs;

public class CountOccurencesOfChar {
 
	static String str = "pavani";
	public static void Char(String str,char ch) {
		int count = 0;
		for(char c :str.toCharArray()) {
			if(c == ch) {
				count++;
			}
		}
      System.out.println(ch +":" +count);
	}
	public static void main(String[] args) {
		Char(str,'a');
	}

}
