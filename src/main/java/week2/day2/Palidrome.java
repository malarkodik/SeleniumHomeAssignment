package week2.day2;

public class Palidrome {

	public static void main(String[] args) {
		
		int input = 120021;
		String outputStr = "";
		
		String inputStr = Integer.toString(input);
		
		for (int i=inputStr.length()-1; i>=0;i--) {
			outputStr = outputStr + inputStr.charAt(i);			
		}
		System.out.println(inputStr);
		System.out.println(outputStr);
		if (inputStr.equalsIgnoreCase(outputStr)) {
			System.out.println("Given number is a PALIDROME: " + input);
		} else {
			System.out.println("Given number is NOT a PALIDROME: " + input);
		}

	}

}
