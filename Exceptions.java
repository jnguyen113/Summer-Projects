package tryCatch;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int power = 0;
		try {
			if(a < 0 || b < 0) {
				throw new Exception ("a or b should not be 0");
			}else if(a == 0 && b == 0) {
				throw new Exception ("a and b should not be 0");
			}else {
				power = (int)Math.pow(a,b);
			}
			System.out.println(power);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


}
