
import java.util.Scanner;

/*C3 version : For prime recognition, 
 * "for" loop{
 * 	 1. starts from 3 to sqr(n) /2)  
 *	 2.only check "odd" numbers (+2 steps)} */

public class C4Version {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		int time = 0; //This variable will contain the time*frequency of the whole process
		System.out.print("Please enter the number: ");
		sc = new Scanner(System.in);
		time += 2;
		int num = sc.nextInt();
		time += 2;
		boolean flag = false;
		time += 1;
		time += 1;
		if (num == 2) {
			
			System.out.println(num+" is prime.");
			
		}
		
		else if (num == 1 || num == 0) {
			
			System.out.println(num + " is not prime!");
			time += 3;
			
		}else if (num % 2 == 0) {
			System.out.println(num + " is not prime!");
			time += 2;

		}
		else {
			time += 3;
		for (int i = 3 ; i <= Math.sqrt(num) ; i += 2) {
			time += 3;
			time += 2;
			
			if(num % i == 0) {
				
				time += 1;
				flag = true;
				break;
			}
			
		}time += 1;
		if (flag) {
			
			System.out.println(num + " is not prime!" );
			
			
		}else {
			
			System.out.println(num + " is prime");
		}
	}
		System.out.println("Time :"+ time);
	
	}
	
}//**************end of the class.

