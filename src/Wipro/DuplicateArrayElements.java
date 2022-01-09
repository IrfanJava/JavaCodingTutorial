package Wipro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class DuplicateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				if(!list.contains(arr[i]))
					list.add(arr[i]);
			}
		}
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");

	}

}
