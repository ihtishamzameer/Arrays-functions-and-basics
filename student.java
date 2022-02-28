import java.util.Scanner;

public class student {
	String name;
	int r;
	public  void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		 name=sc.nextLine();
		System.out.println("enter roll number");
		 r=sc.nextInt();
		
	}
	public void display()
	{
		System.out.println("name is : "+this.name);
		System.out.println("roll number is : "+this.r);
	}
}
