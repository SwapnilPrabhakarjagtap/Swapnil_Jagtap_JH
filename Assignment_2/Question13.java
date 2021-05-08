class Question13
{
public static void main(String args[])
{
int a=64, i, j;
int k,l;
for(i=1;i<=5;i++)
   {
    for(j=5;j>=i;j--)
    {
      System.out.print(" ");
     }

     for(k=1;k<=i;k++)
     {
       System.out.print((char)(a+i)+" ");
      }
      System.out.println();
    }

}
}