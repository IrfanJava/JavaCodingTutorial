import java.io.PrintWriter;
import java.util.*;
import java.io.*;
public class Primepalindromic {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr=new PrintWriter(System.out);
		int T=Integer.parseInt(br.readLine().trim());
		for(int i=0;i<T;i++) {
			String[] line=br.readLine().split(" ");
			int L=Integer.parseInt(line[0]);
			int R=Integer.parseInt(line[1]);
			int out_=palPrime(L,R);
			System.out.println(out_);
		}
		wr.close();
		br.close();

	}
	static int isprime(int n) {
		int flag=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=0;
				break;
			}
		}
		if(flag==1)
			return 1;
		else
			return 0;
	}
	static int isPalindrome(int n) {
		int rev=0;
		int tnum=n;
		while(n!=0) {
			rev=rev*10+n%10;
			n/=10;
		}
		if(rev==tnum)
			return 1;
		else
			return 0;
	}
	static int palPrime(int L,int R) {
		int count=0;
		for(int i=L;i<=R;i++) {
			if(isprime(i)==1 && isPalindrome(i)==1)
				count++;
		}
		return count;
	}

}
