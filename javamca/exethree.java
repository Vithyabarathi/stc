import java.io.*;
class exethree
{
public static void main(String args[])throws FileNotFoundException
{
PrintWriter e=new PrintWriter("test.txt");
e.println("hello");
e.close();
}
}