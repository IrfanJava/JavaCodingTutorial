package Mindtree;
import java.util.*;
public class BinarySearch {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1)Binary search for Integer elements\n2)Binary search for Strings\n3)Exit");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter Integer Array Size");
				int n=sc.nextInt();
				int arr[]=new int[n];
				System.out.println("Enter Array Elements");
				for(int i=0;i<n;i++)
					arr[i]=sc.nextInt();
				System.out.println("Enter Key");
				int key=sc.nextInt();
				System.out.println(findElement(arr,key));
				System.out.println();
			}
			else if(ch==2) {
				System.out.println("Enter String Array Size");
				int m=sc.nextInt();
				String names[]=new String[m];
				System.out.println("Enter Array Elements");
				for(int j=0;j<m;j++)
					names[j]=sc.next();
				System.out.println("Enter name to search");
				String name=sc.next();
				System.out.println(findString(names,name));
				System.out.println();
			}
			else if(ch==3) {
				break;
			} 
		}
	}
	static Boolean findElement(int arr[], int key) {
		int left=0,right=arr.length-1;
		int mid=(left+right)/2;
		while(left<=right) {
			if(arr[mid]==key) {
				return true;
			}
			else if(arr[mid]>key) {
				right=mid-1;
			}
			else if(arr[mid]<key) {
				left=mid+1;
			}
			mid=(left+right)/2;
		}
		return false;
	}
	static Boolean findString(String names[], String name) {
		int left=0,right=names.length-1;
		int mid=(left+right)/2;
		while(left<=right) {
			if(names[mid].equals(name)) {
				return true;
			}
			else if(names[mid].compareTo(name)<0) {
				left=mid+1;
			}
			else if(names[mid].compareTo(name)>0){
				right=mid-1;
			}
			mid=(left+right)/2;
		}
		return false;
	}

}
