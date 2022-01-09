package Sorting;
import java.util.*;
public class ArrayOddEvenSegragationandordering{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer>listo =new ArrayList<>();
		List<Integer>listo1 =new ArrayList<>();
		List<Integer>liste =new ArrayList<>();
		List<Integer>list =new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				listo.add(arr[i]);
			}
			else if(arr[i]%2==0) {
				liste.add(arr[i]);
			}
		}
		Collections.sort(liste);
		Collections.sort(listo);
		for(int i=listo.size()-1;i>=0;i--) {
			listo1.add(listo.get(i));
		}
		list.addAll(listo1);
		list.addAll(liste);
	
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}