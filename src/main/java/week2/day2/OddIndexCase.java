package week2.day2;

public class OddIndexCase {

	public static void main(String[] args) {
		
		String str = "encyclopediaaaaaaaaaa";
		String revStr = "";
		int j=1;
		
		for (int i=0; i<str.length();i++) {
			if (i==j) {
				revStr = revStr + Character.toUpperCase(str.charAt(i));
				j=j+2;
			} else {
				revStr = revStr + str.charAt(i);				
			}
		}
		System.out.println(revStr);
	}

}
