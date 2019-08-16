import java.io.*;
import java.util.Scanner;
class student
{
public static void main(String args[])
{
int a;
int fact=1;
System.out.println("enter the factorial number");
Scanner s=new Scanner(System.in);
a=s.nextInt();
while(a>0)
{
fact=fact*a;
a--;
}
System.out.println("ther factorial is" +fact);
}
}


