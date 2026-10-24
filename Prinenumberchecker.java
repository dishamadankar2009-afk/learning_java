//Print if a number n is prime or not (Input n from the user).

import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n < 2){
	        System.out.println("this is neither prime nor composite");
	        return;
	    }
	    
	    boolean isPrime = true;
	    for(int i = 2; i*i <= n; i++){
	        if(n%i == 0){
	            isPrime = false;
	            break;
	        }
	    }
	    if(isPrime ){
	        System.out.println("this is prime number");
	        }else{
	            System.out.println("this is not prime number");
	        }
	}
}
