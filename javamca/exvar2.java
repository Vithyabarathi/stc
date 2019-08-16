import java.io.*;
class exvar2
{
public static void vithya(int...x)
{
	int sum=0;
	for(int z:x)
	{
		sum=sum+z;

	}
	System.out.println(sum);
}
public static void main(String args[])
{
vithya();
vithya(5,6,7);
}
}
