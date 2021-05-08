class Hollow1
{
public static void main(String args[])
{
int i,j;
for(i=6;i>=1;i--)  
    {  
      for(j=1;j<=i;j++)  
      {  
         if(j==1 || j==i || i==6)  
          System.out.print("*");  
          else  
          System.out.print(" ");  
      }  
      System.out.println();
    }  
}
}