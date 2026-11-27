import java.util.Scanner;

public class functions {
	
	public static int oddNumberSum(int n){
	    int number = 0;
	    for(int i =1; i<=n; i++){
	        if(i %2 == 1){
	            number = number +i;
	        }
	    }
	    return number;
	}
	    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("sum of odd numbers upto "+ n+" is : "+ oddNumberSum(n));
		

		}
}
