 class Assign21
 {    
public static String toOctal(int decimal)
{    
    int rem;  
    String octal="";   
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
   
    while(decimal>0)  
    {  
       rem=decimal%8;   
       octal=octalchars[rem]+octal;   
       decimal=decimal/8;  
    }  
    return octal;  
}    
public static void main(String args[])
{      
System.out.println("Decimal of octal 15 is: "+toOctal(15));  
  
  
}
}      
