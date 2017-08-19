import java.util.Scanner;
class fibonacci
{


	public static void main(String... a)
	{
		int n,first=0,second=1,next,i;
	System.out.println("enter number of terms in fibonacci series");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	System.out.println("first "+n+" terms of fibonacci series are:");
	for(i=0;i<n;i++)
		{
		if(i<=1)
			next=i;
		else
			{
			next=first+second;
			first=second;
			second=next;
			}
		System.out.println(next);	
		}
	}
}