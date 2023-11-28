package week2.day2;

import java.util.Arrays;

public class ReverseOddStr {

	public static void main(String[] args) {
		
		String test = "I am a software tester engineer at TestLeaf";
				String[] words = test.split(" ");
		int i=0,j=1;
		test = "";
		String test1 = "";
		
		for (String str:words) {
			
			if(i!=j) {
				test = test +" "+ str;
				i++;
			} else {
				for (int k=str.length()-1; k>=0; k--) {
					test1 = test1+str.charAt(k);
				}
				test = test +" "+ test1;
				test1="";
				j++;
			}
				
		}
		System.out.println(test);
	}

}
