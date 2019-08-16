import java.io.*;
import java.util.*;
class exetwo
{
	static int a;
public static void main(String args[])
{
mymethod();
}
public static void mymethod()
{
mynewmethod();
}
public static void mynewmethod()
{
	try
	{
System.out.println(a/0);
     }
catch(Exception e)
{
	System.out.println("exeception throwed");
}
}
}