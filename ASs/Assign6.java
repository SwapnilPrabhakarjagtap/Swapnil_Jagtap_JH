//Assign6//
import java.util.Scanner;
class Assign6
{
public static void main(String args [])
	{
	 Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Input first Number");
		a = sc.nextInt();
		System.out.println("Input Second Number");
		b = sc.nextInt();
	int	c = a+b;
	
	int d = a-b;
	
	int e = a*b;
	int f = a/b;
	int g = a % b;
	System.out.println("125+24= "+c);
	System.out.println("125-24= "+d);
	System.out.println("125*24= "+e);
	System.out.println("125/24= "+f);
	System.out.println("125 % 24= "+g);
	}
}