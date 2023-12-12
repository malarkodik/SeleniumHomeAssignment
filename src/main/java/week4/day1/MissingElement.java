package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		Integer[] num = {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> lst = Arrays.asList(num);
		
		Collections.sort(lst);
		
		System.out.println(lst);
		int j=0;
		int k=0;
		for (int i=0; i<lst.size(); i++) {
			j=j+1;
			if(lst.get(k)!= j) {
				System.out.println("Number Missing: "+j);
				k=k+0;
			} else {
				k=k+1;
			}
		}
		

	}

}
