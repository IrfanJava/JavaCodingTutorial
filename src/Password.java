import java.util.*;
public class Password {
	 static int checkpass(String s) {
		boolean numberflag=false;
		boolean upperflag=false;
		if(s.length()>=4) {
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))) {
					numberflag=true;
				}
				else if(Character.isUpperCase(s.charAt(i))) {
					upperflag=true;
				}
				else if(s.contains(" ") || s.contains("/")) {
					return 0;
				}
				else if(Character.isDigit(s.charAt(0))) {
					return 0;
				}
			}
			if(numberflag && upperflag)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int ret=checkpass(s);
		System.out.println((ret==1)?"Valid Password":"Not Valid Password");
	}

}
