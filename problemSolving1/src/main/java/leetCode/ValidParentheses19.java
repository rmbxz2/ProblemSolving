package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
* Valid Parentheses page 19
*
*
*
*
*
*/
public class ValidParentheses19 {
	/**
	*  my solution
	*
	*/
	public static boolean isValidSolutin1(String message) {
		// '(',  ')' , '[' ,  ']' ,  '{' ,   '}'
		char[] chars = message.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (Character character : chars) {
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
			} else if (character == ')' || character == ']' || character == '}') {
				Character stackChar = stack.pop();
				if (stackChar == '(' && character == ')') {
				} else if (stackChar == '[' && character == ']') {
				} else if (stackChar == '{' && character == '}') {
				} else {
					return false;
				}
			} else {
				System.out.println("cant push stack " + character);
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	* leetcode solution page 42
	* 
	*/
	public static boolean isValidSolutin2(String message) {
		char[] chars = message.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		for (Character character : chars) {
			if (map.containsKey(character)) {
				stack.push(character);
			} else if (map.containsValue(character)) {
				if (map.get(stack.peek()) == character)
					stack.pop();
			}
		}
		return stack.isEmpty();
	}

	/**
	*
	* my solution
	*/
	public static boolean solution3(String message) {
		char[] chars = message.toCharArray();
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		for (Character character : chars) {
			if (map.containsKey(character)) {
				stack.push(character);
			} else if (map.containsValue(character)) {
			    if(map.get(stack.peek())==character)
					stack.pop();
			}
		}
		return stack.isEmpty();
	}

	/**
	 * 
	 * 
	*/
	public static void main(String[] args) {
		String message = "[(({and,}[]))"; // in text file run M-x rnb  rainbow delimiters  
		System.out.println("the message is " + isValidSolutin1(message));
		System.out.println("the message is " + isValidSolutin2(message));
	}
}
