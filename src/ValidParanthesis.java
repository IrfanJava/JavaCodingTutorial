import java.util.*;
public class ValidParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim();
		Stack<Character> stacky=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(!stacky.isEmpty()) {
				switch(s.charAt(i)) {
				case '}':
					if(stacky.peek()=='{')
						stacky.pop();
					break;
				case ']':
					if(stacky.peek()=='[')
						stacky.pop();
					break;
				case ')':
					if(stacky.peek()=='(')
						stacky.pop();
					break;
				default:
					stacky.push(s.charAt(i));
				}
			}
			else
				stacky.push(s.charAt(i));
		}
		System.out.println(stacky.isEmpty()?"Valid":"Not Valid");
	}

}
