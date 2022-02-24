import java.util.Scanner;
class quicksort
{
public static void quickSort (String A[], int p, int r)
{
if (p < r)
{
int q = partition (A, p, r);
quickSort (A, p, q - 1);
quickSort (A, q + 1, r);
}
}
public static int partition (String A[], int p, int r)
{
String x = A[r];
int i = p - 1;
for (int j = p; j <= r - 1; j++)
{
if (A[j].compareToIgnoreCase(x) <= 0)
{
i = i + 1;
String temp = A[i];
A[i] = A[j];
A[j] = temp;
}
}
String temp = A[i + 1];
A[i + 1] = A[r];
A[r] = temp;
return i + 1;
}
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.print("Enter the limit : ");
int n = sc.nextInt();
sc.nextLine();
String A[] = new String[n];
System.out.print("Enter the values : \n");
for (int i = 0; i<n; i++)
{
A[i] = sc.nextLine ();
}
quickSort (A, 0, n - 1);
System.out.println("\nAfter quick sort");
for (int i = 0; i<n; i++)
{
System.out.print(A[i]+" ");
}
}
}
