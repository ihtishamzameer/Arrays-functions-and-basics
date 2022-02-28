import java.util.Scanner;
public class Array {
	static int[] arr=new int[4];
	static int index=-1;
	public static void insertatlast()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number it will appear at the last of the array");
		int x=sc.nextInt();
		if(index==arr.length-1)
		{
			grow();
		}
		index++;
		arr[index]=x;
	}
	public static void grow()
	{
		System.out.println("gorwing the array");
		int[] temp=new int[arr.length+3];
		for(int i=0 ; i<=index ;i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;

	}
	public static void display()
	{
		if(index==-1)
		{
			System.out.println("array is empty");
		}
		else
		{
			System.out.println("your entered data is:   ");
			for(int i=0 ; i<=index ; i++)
			{
				System.out.print(arr[i]+"   ");
			}
		}
	}
	public static void insertatstart()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start value");
		int x=sc.nextInt();
		if(index==-1)
		{
			index++;
			arr[index]=x;
		}
		if(index==arr.length-1)
		{
			grow();
		}
		else
		{
			for(int i=index+1 ; i>0; i--)
			{
				arr[i]=arr[i-1];
			}
			
		}
		arr[0]=x;
		index++;
	}
	public static void removelast()
	{
		if(index==-1)
		{
			System.out.println("array is empty");
		}
		else
		{
			index--;
			System.out.println();
			for(int i=0 ; i<=index ; i++)
			{
				System.out.print(arr[i]+"   ");
			}
		}
		
	}
	public static void countarray()
	{
		System.out.print(" count is : ");
		
			System.out.println(arr[index]+"  ");
	}
	public static void search()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id");
		int s=sc.nextInt();
		int temp=0;
		for(int i=0 ; i<=index ; i++)
		{
			if(s==arr[i])
			{
				temp=i;
			}
		}
		System.out.println("index: "+temp);
		System.out.println("position: "+(temp+1));
	}
	public static void main(String[] args)
	{
		for(int i=0 ; i<6 ; i++)//size is 4 but we can store more than 4 numbers using grow function.
		{
			insertatlast();
		}
		display();
		insertatstart();
		display();
		System.out.println();
		System.out.println("remove last :");
		removelast();
		System.out.println();
		countarray();
		search();
		
	}

}
