package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int flag=0;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0){
				flag++;
				System.out.println("The given number "+num+" is NOT a prime number");
				break;
			}
		}
		if (flag==0) {
			System.out.println("The given number "+num+" is a prime number");
		}			

	}

}
