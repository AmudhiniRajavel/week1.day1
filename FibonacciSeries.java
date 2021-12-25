package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10, n1=0,n2=1;
		System.out.println(n1);
		
		for(int i=1; i<=n; i++) {
			int n3 = n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
					
	}

}
}
