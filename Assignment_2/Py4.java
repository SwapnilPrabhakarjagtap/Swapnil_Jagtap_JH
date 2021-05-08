class Py4
{
public static void main(String args[])
{
int i,j,k,l;
for(i=1;i<=9;i++)
   {

    for(j=9;j>=i;j--)
    {
      System.out.print("  ");
     }

     for(k=1;k<=i;k++)
     {
       System.out.print(k+" ");
      }

      for(j=i;j>=2;j--)
      {
        System.out.print((j-1)+" ");
        }
      System.out.println();
    }
 }
}
