//matrix multiplication java program
import java.util.Scanner;
class matrix//(file name should be same as class name)
{
 public static void main(String arg[])
 {
  int[][] mat1= new int[50][50];
  int[][] mat2= new int[50][50];
  int[][] mat3= new int[50][50];
  int m,n,p,q,i,j,f=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the order of first metrix(row,coloumn)");
  m = sc.nextInt();
  n = sc.nextInt();
  System.out.println("Enter the order of second metrix(row,coloumn)");
  p = sc.nextInt();
  q = sc.nextInt();
  if(n==p)
  {
   System.out.println("Enter the elements of first metrix(row wise)");
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
     mat1[i][j]= sc.nextInt();
    }
   }
   System.out.println("Enter the elements of second metrix(row wise)");
   for(i=0;i<p;i++)
   {
    for(j=0;j<q;j++)
    {
     mat2[i][j]= sc.nextInt();
    }
   }
   System.out.println("\n\nFirst metrix");
   System.out.println("-----------------");
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
     System.out.print(mat1[i][j]+"\t");
    }
    System.out.println("");
   }
   System.out.println("\n\nsecond metrix");
   System.out.println("-----------------");
   for(i=0;i<p;i++)
   {
    for(j=0;j<q;j++)
    {
     System.out.print(mat2[i][j]+"\t");
    }
    System.out.println("");
   }
   for(i=0;i<p;i++)
   {
    for(j=0;j<p;j++)
    {
     mat3[i][j] = 0;
     for(int k=0;k<n;k++)
     {
      mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
     }
    }
   }
   System.out.println("\n\nproduct metrix");
   System.out.println("-----------------");
   for(i=0;i<m;i++)
   {
    for(j=0;j<q;j++)
    {
     System.out.print(mat3[i][j]+"\t");
    }
    System.out.println("");
   }
  }
  else
  {
   System.out.println("Multiplication of metrixes is not possible!!!!!!");
  }
 }
}
