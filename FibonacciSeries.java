package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int j=0,k=1,l=0;
		System.out.println(j);
		System.out.println(k);
		for (int i=2;i<n;i++) {
			l=j+k;
			j=k;
			k=l;
			System.out.println(l);
		}
		

	}

}
