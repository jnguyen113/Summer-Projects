package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try method tests block of code for errors
		//catch block contains the code and does the exception if it occurs
		//given two integers, compute x/y
		//if the nextInt are not in the try method, it will prints java's error message instead
		
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int quotient = a/b;
			if(b == 0) {
				throw new ArithmeticException("/ by zero") ;
			}else {
				System.out.println(quotient);
			}
		}
		catch(InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}


	}


}
