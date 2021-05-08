import java.util.*;
class Assign23
{  
public static void main(String args[])
	{
		int hexno[]=new int[100];
		//int num=1101;
		int r,cr=0,b,k=1,decno=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary number ");
		int num=sc.nextInt();
		
		while(num>0)
		{
			cr=num%2;
			decno=decno+cr*k;
			k=k*2;
			num=num/10;
		}
		k=0;
		while(decno!=0)
		{
			hexno[k]=decno % 16;
			decno=decno/16;
			k++;
		}
		
		for(int m=k-1;m>=0;m--)
		{
			if(hexno[m]>9)
			{
				System.out.print((char)(hexno[m]+55));
			}
			else
			{
				System.out.println(hexno[m]);
			}
		}
	}
}  
		