import java.util.*;
class Assign18
{
	public static void main(String args[])
	{

		String binone, bintwo;
        int i, w;
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter First Binary Number");
        binone = sc.next();
 
        System.out.println("Enter Second Binary Number");
        bintwo = sc.next();
        
        i = Integer.parseInt(binone, 2);
        w = Integer.parseInt(bintwo, 2);
 
      
        System.out.println("Multiplication = " + Integer.toBinaryString(i * w));
       
    }
}
