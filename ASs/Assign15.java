import java.util.Scanner;
class Assign15
{
	public static void main(String args[])
	{
	int a,b;
	int temp;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number");
	a=sc.nextInt();
	
	System.out.println("Enter Second number");
	b=sc.nextInt();
	
	System.out.println("Before Swap: a=  "+a + "b=  "+b);
	
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("After Swap: a=  "+a + "b=  "+b);
	
	
		
	
	}
}