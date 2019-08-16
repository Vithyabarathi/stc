import java.io.*;
import java.util.Scanner;
class odd
{
public static void main(String args[])
{
int a;
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a%2==0)
{
System.out.println("It is even number");
}
else
{
System.out.println("it is odd  number");
}
}
}
