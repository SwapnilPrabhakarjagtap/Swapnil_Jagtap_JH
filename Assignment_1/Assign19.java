import java.util.Scanner;
class Assign19
{
	public static void main(String args[])
	{
		long convertDecimalToBinary(int n);
		{
			long binarynumber=0;
			int remainder,i=1,step=1;
			
			while(n!=0)
				
			{
				remainder = n % 2;
					n/=2;
				binarynumber +=remainder*i;//binarynumber=binarynumber+remainder*int
				i*=10;
				
			}
			return binarynumber;
		}
	}
}