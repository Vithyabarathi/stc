import java.io.*;
import java.util.*;
class exeone
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
System.out.println(a/0);
}
}