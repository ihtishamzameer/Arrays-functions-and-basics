package LAB2;

import java.util.Scanner;

public class ARRAY {
	static int[] arr=new int[4];
	static int index=-1;
	public static void insertatlast()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value: ");
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
		System.out.println();
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
			System.out.println("removed value is : "+arr[index]);
			index--;
			System.out.println();
			for(int i=0 ; i<=index ; i++)
			{
				System.out.print(arr[i]+"   ");
			}
			System.out.println();
		}
		
	}
	public static void countarray()
	{
		System.out.print(" count is : ");
		System.out.println(index+1);
	}
	public static void search()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id");
		int s=sc.nextInt();
		int temp=0;
		int flage=0;
		for(int i=0 ; i<=index ; i++)
		{
			if(s==arr[i])
			{
				temp=i;
				flage=1;
				System.out.println("index: "+temp);
				System.out.println("position: "+(temp+1));
				break;
			}
			
		}
		if(flage==0)
		{
		System.out.println("not found");
		}
		
	}
	
	public static void removefirst()
	{
		if(index==-1)
		{
			System.out.println("array is empty");
		}
		else
		{
			if(index==-1)
			{
				System.out.println("array is empty");
			}
			else
			{
				System.out.println("removed number is : "+arr[0]);
				if(index==arr.length-1)
				{
					grow();
				}
				int[] temp=new int[arr.length+1];
				for(int i=0 ; i<=index ;i++)
				{
					temp[i]=arr[i+1];
				}
				arr=temp;
				index--;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		do {
			System.out.println("enter 1 for insert value at last");
			System.out.println("enter 2 for insert value at start");
			System.out.println("enter 3 for display all data");
			System.out.println("enter 4 for delete last value");
			System.out.println("enter 5 for display count");
			System.out.println("enter 6 for delete first value");
			System.out.println("enter 7 for exit");
			 x=sc.nextInt();
			if(x==1)
			{
				
				insertatlast();
				
			}
			else if(x==2)
			{
				insertatstart();
			}
			else if(x==3)
			{
				display();
			}
			else if(x==4)
			{
				removelast();
			}
			else if(x==5)
			{
				countarray();
			}
			else if(x==6)
			{
				removefirst();
			}
			
			
		}while(x!=7);
		
	}


}
