class Question10
{
public static void main(String args[])
{
int a=64, i, j;
int k,l;
for(i=5;i>=1;i--)
   {
    for(j=1;j<=i;j++)
    {
      System.out.print(" ");
     }
     for(k=i;k<=5;k++)
     {
       System.out.print((char)(a+k)+" ");
      }
      System.out.println();
    }

}
}