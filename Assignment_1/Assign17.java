import java.util.Scanner;
class Assign17 
{
   public static void main(String[] args)
   {
		 
	int b1, b2;
	int i = 0, carry = 0;
	
	int[] add = new int[10];//create array

	
	Scanner sc = new Scanner(System.in);

	
	System.out.print("Enter first binary number: ");
	b1 = sc.nextInt();
	
	System.out.print("Enter second binary number: ");
	b2 = sc.nextInt();

	while (b1 != 0 || b2 != 0) 
	{
		add[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);//typecasting
		carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
		b1 = b1 / 10;
		b2 = b2 / 10;
	}
	if (carry != 0) 
	{
		add[i++] = carry;
	}
		--i;
	System.out.print("Output: ");
	while (i >= 0) {
		System.out.print(add[i--]);
	}
	System.out.print("\n");  
   }
}