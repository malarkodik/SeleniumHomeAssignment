package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> strList = Arrays.asList(strArray);
		
		Collections.sort(strList);
		
		for (int i=strList.size()-1; i>=0; i--) {
			System.out.println(strList.get(i));			
		}
		
		//Without loop statement
		Collections.sort(strList,Collections.reverseOrder());
		System.out.println("\nList in reverse order: "+strList);

	}

}
