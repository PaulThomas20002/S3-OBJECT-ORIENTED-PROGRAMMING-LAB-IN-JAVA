/*Write a Java program that reads a line of integers, 
and then displays each integer, and the sum of all the integers (Use String Tokenizer class of java.util). ** */

import java.util.*;
class DemoStringTokenizer{
  public static void main(String[]args){
    int n;
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter integers with one space");
    String s = sc.nextLine();
    StringTokenizer st = new StringTokenizer(s , " ");
    
    while(st.hasMoreTokens()){
       String temp = st.nextToken();
       n = Integer.parseInt(temp);
       System.out.println(n);
       sum = sum +n ;
    }
   
    System.out.println("Sum of Integer is " + sum);
        sc.close(); 
 }
}
