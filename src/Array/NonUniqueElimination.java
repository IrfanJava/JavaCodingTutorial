package Array;
import java.util.*;
public class NonUniqueElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.matches("[a-zA-z ]*")) {
			String ch[]=s.split(" ");
			for(int i=0;i<ch.length;i++) {
				int count=0;
				for(int j=0;j<ch[i].length();j++) {
					if(counts(ch[i],ch[i].charAt(j)+"")>1){
						ch[i]=ch[i].replace(ch[i].charAt(j)+"","");
					}
				}
			}
			for(int i=0;i<ch.length;i++) {
				System.out.print(ch[i]+" ");
			}
		
		}
		else{
			System.out.println(s+" is an invalid sentence");
		}

	}
	public static int counts(String s1,String s2) {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)+"").equals(s2))
				count++;
		}
		return count;
	}

}
