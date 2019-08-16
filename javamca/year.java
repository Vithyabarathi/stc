import java.io.*;
import java.util.Scanner;
class year
{
public static void main(String args[])
{
int a;
System.out.println("enter your choice of the year");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a%4==0)
{
System.out.println("it is leap year");
}
else
{
System.out.println("not a leap year");
}
}
}

