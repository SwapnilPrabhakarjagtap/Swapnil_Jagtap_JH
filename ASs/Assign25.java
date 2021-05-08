import java.util.*;
class Assign25
{  
public static void main(String args[])
	{
		int num=10;
		System.out.println("Octal number is= "+num);
		int i=0,d=0;
		
		while(num>0)
		{
			int r=num%10;
				num=num/10;
			d=d+r*(int)Math.pow(8,i++);
			
				
		}
		System.out.println("After converting   ");
		System.out.println("Decimal number is= "+d);
			
	}
}  