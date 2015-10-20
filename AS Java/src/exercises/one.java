package exercises;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		
	Scanner input= new Scanner(System.in);
	int num=input.nextInt();
	
	if(num % 2==0)
		System.out.println("Number is even");
	else
		System.out.println("Number is odd");
	
	}

	public static boolean isEven(int num){
		return num % 2 == 0;
	}

} 
