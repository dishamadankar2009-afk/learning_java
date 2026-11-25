import java.util.Scanner;

public class functions{
	public static void checkPrimeNumber(int n){
	    if (n<2){
	        System.out.print("number are neither prime nor composite");
	        return;
	    }
	    
	    for(int i = 2; i<=n-1; i++){
	        if(n%i==0){
	            System.out.print(" number are not prime");
	            return;
	        }
	    }
	    System.out.println("number is prime");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		checkPrimeNumber(n);
	}
}
