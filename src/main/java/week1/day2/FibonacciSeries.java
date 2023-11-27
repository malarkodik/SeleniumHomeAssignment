package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Fibonacci Series
		int i,j,k,l,rangeVal;
		rangeVal = 10;
		j=1;
		k = 0;
		for (i = 0; i < rangeVal; i++) {
			l=k;
			System.out.println(k);
			k=k+j;
			j=l;			
		}

	}

}
