import java.util.*;
class Assign24
{  
public static void main(String args[])
	{
		int bin1=111;
		int cr,decimalno=0,d,k=1;
		
		int octal[]=new int[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("The Binary number is= "+bin1);
		while(bin1>0)
		{
			cr=bin1%10;
			decimalno=decimalno+cr*k;
			k=k*2;
			bin1=bin1/10;
		}
		k=1;
		d=decimalno;
		while(d>0)
		{
			octal[k++]=d%8;
			d=d/8;
			+
		}
		
		for(int i=k-1;i>0;i--)
		{
			System.out.print("The octal is= "+octal[i]);
		}
		
		
	}
}  
