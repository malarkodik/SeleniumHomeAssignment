package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		Integer[] num = {3, 12, 11, 4, 6, 7};
		List<Integer> numList = Arrays.asList(num);
		
		System.out.println("Increasing Order: \n"+numList);
		Collections.sort(numList,Collections.reverseOrder());
		System.out.println("Decreasing Order: \n"+numList);
		System.out.println("Second Largest Number: "+numList.get(1));
		
	}

}
