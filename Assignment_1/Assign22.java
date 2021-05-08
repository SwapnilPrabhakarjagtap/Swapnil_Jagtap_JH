import java.util.*;
class Assign22
{  
public static void main(String args[])
	{
		int num=100;
		System.out.println("Binary no= "+num);
		int i=0,d=0;
		
		while(num>0)
		{
			int r=num%10;
				num=num/10;
			d=d+r*(int)Math.pow(2,i++);
			
				
		}
		
		System.out.println("Decinmal no= "+d);
			
	}
}  