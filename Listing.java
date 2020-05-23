import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Listing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to add?");
		int numOfItems = sc.nextInt();
		System.out.println("Print the numbers separated by next lines");

		List<Integer> arr = new ArrayList<Integer>(numOfItems);
		for(int i = 0 ; i < numOfItems ; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("How many number of operations would you like to perform with these numbers?");
		int operations = sc.nextInt();
		System.out.println("What would the operation be?");
		String insert = "Insert";
		String delete = "Delete";
		while(operations > 0) {
			sc.nextLine();
			String reader = sc.nextLine();
			if(reader.equals(insert)){
				System.out.println("Insert at what index, Insert what value?");
				int ins = sc.nextInt();
				int val = sc.nextInt(); 
				arr.add(ins, val);
			}	
			operations--;
			System.out.println("Next operation?");
			sc.nextLine();
			reader = sc.nextLine();
			if(reader.equals(delete)) {
				System.out.println("Delete at what index");
				int del = sc.nextInt();
				arr.remove(del);
			}
			operations--;
		}
		System.out.println(arr);

	}

}
