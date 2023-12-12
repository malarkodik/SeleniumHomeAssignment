package week4.day1;

import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] l1 = {3, 2, 11, 4, 6, 7};
		Integer[] l2 = {1, 2, 8, 4, 6, 7};
		
		List<Integer> list1 = Arrays.asList(l1);
		List<Integer> list2 = Arrays.asList(l2);
		
		for (int i=0; i<list1.size(); i++) {
			if (list1.contains(list2.get(i))) {
				System.out.println(list2.get(i));
			}			
		}
		
	}

}
