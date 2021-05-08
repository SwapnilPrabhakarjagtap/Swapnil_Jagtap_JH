class Hollow2
{
public static void main(String args[])
{
int i,j,k;
int m=6;
for(i=1;i<=6;i++)  
   {  
       for(j=1;j<=m-1;j++)  
       {  
           System.out.print("  "); 
       }  
       for(k=1;k<=2*i-1;k++)  
       {  
          if(k==1 || k==2*i-1 || i==6)  
         System.out.print("* ");  
         else  
         System.out.print("  ");  
       }  
       m--;  
     
      System.out.println();  
    }  
}
}