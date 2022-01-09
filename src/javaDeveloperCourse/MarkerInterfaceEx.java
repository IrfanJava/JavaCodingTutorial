package javaDeveloperCourse;
public class MarkerInterfaceEx implements Cloneable
{
	int i;
	String s;
	public MarkerInterfaceEx(int i,String s)
	{
		this.i = i;
		this.s = s;
	}

	protected Object clone()throws CloneNotSupportedException
	{
     return super.clone();
	}
	public static void main(String[] args)throws CloneNotSupportedException
	{
		MarkerInterfaceEx a = new MarkerInterfaceEx(20, "Irfan");
		MarkerInterfaceEx b = (MarkerInterfaceEx)a.clone();
		System.out.println(b.i);
		System.out.println(b.s);
	}	
}
 