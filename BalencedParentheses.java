import java.util.*;
public class BalencedParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Let user input a parentheses to check, print true or false whether it is balanced or not
		Scanner sc = new Scanner (System.in);
		
		
		while(sc.hasNext()) {
			String s = sc.next();
			
			System.out.println(isBalanced(s));

		}
		
	}
	public static boolean isBalanced(String s) {
		char[] ca = s.toCharArray();
		Stack <Character> myStack = new Stack<>();
		for(int i = 0 ; i < ca.length ; i++) {
			if(ca[i] == '(' || ca[i] == '{' || ca[i] == '[') {//if it contains an opening bracket, push it to the stack
				myStack.push(ca[i]);
			}
			if(ca[i] == ')' || ca[i] == '}' || ca[i] == ']') {
				if(myStack.isEmpty()) {//if it starts with one of this and there is nothing in the stack, then it is false
					return false;//if it contains a closing without an open, then it is not balanced
				}else if(!isMatchingPair(myStack.pop(), ca[i])) {
					return false;
				}
			}
			
		}
		if(!myStack.empty()) {
			return false;
		}
		return true;
		
	}
	public static boolean isMatchingPair(char open, char close) {
		if(open == '(' && close == ')') {
			return true;
		}else if(open == '{'&& close == '}') {
			return true;
		}else if (open == '[' && close == ']') {
			return true;
		}else {
			return false;
		}
		
	}


}
