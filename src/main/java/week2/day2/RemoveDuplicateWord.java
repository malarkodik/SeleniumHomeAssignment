package week2.day2;

public class RemoveDuplicateWord {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		String[] strArray = text.split(" ");
		String str1 = "";
		
		for (String str : strArray) {
			if(str1.toLowerCase().indexOf(" "+str.toLowerCase()) == -1) {
				str1 = str1 +" "+ str;
			} else {
				str1 = str1 + "  ";
			}
		}
		System.out.println(str1);		
	}

}