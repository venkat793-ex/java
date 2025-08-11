//usinng if else to find weekdays
import java.util.Scanner;
class Weekdays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number");
		int number=sc.nextInt();
		if(number==1)
			System.out.print("sunday");
		else
		if(number==2)
			System.out.print("monday");
		else
		if(number==3)
			System.out.print("tuesday");	
		else
		if(number==4)
			System.out.print("wednesday");
		else
		if(number==5)
			System.out.print("thursday");
		else
		if(number==6)
			System.out.print("friday");
		else
		if(number==7)
			System.out.print("saturday");
	}
}