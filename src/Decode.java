import java.util.*;
public class Decode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine().trim();
		Stack<Integer> numstack=new Stack<>();
		Stack<String> strstack =new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				int num=ch-'0';
				while(i+1<num && Character.isDigit(s.charAt(i+1))) {
					num=num*10+s.charAt(i+1)-'0';
					i++;
				}
				numstack.push(num);
			}
			else if(ch=='[') {
				strstack.push(sb.toString());
				sb=new StringBuilder();
			}
			else if(ch==']') {
				int repeat=numstack.pop();
				StringBuilder tmp=new StringBuilder(strstack.pop());
				for(int j=0;j<repeat;j++)
					tmp.append(sb);
				sb=tmp;
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
                                                                                
	}

}
