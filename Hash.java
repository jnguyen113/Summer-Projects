import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Hash{

	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many people would you like to add to our directory?");
		int numberOfPeople = Integer.valueOf(br.readLine());
		String name = "";
		int IDNumber = 0;
		
		while(numberOfPeople > 0) {
			System.out.println("What is the person's name?");
			name = br.readLine();
			System.out.println("What is their ID Number?");
			IDNumber = Integer.valueOf(br.readLine());
			map.put(name,IDNumber);
			numberOfPeople--;
		}
		System.out.println("Whose ID Number do you need?");
		String s = br.readLine().toLowerCase();
		if(map.containsKey(s)){
			System.out.println(s + "'s ID Number is " + map.get(s));
		}else {
			System.out.println(s + " is not in our directory");
		}
		
	}
}