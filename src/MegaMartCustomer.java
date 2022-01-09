import java.util.*;
public class MegaMartCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String name=s.substring(0,4);
		if(name.equals("Mega")) {
			String ctype="";
			if(s.contains("Gold") || s.contains("Platinum") || s.contains("Silver")) {
				if(s.contains("Gold"))
					ctype="Gold";
				else if(s.contains("Platinum"))
					ctype="Platinum";
				else if(s.contains("Silver"))
					ctype="Silver";
				int id=Integer.parseInt(s.replaceAll("[^0-9]",""));
				if(id>99 && id<1000) {
					System.out.println("Welcome Mega Mart "+ctype+" Customer");
				}
				else {
					System.out.println("Invalid Customer member ID");
				}
			}
			else {
				System.out.println("Invalid Customer Type");
			}
		}
		else {
			System.out.println("Invalid Shop Name");
		}
	}

}
