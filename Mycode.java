//multiplication of number in java
import java.util.Scanner;
class Mycode
{
	public static void main(String args[])
	{
		System.out.print("enter number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=1;i<=10;i++)
		System.out.println(number + "*" + i + "=" +(number * i));
	}
}
		