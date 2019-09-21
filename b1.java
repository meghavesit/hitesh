import java.util.Scanner;

class Function
{
public static void main(String[] args)
{
	System.out.println("enter the function you would  want perform 1:factorial\n2:reverse\n3:prime\n4:boo");
	Scanner s=new  Scanner(System.in);
	int a=s.nextInt();
	boolean c;
	
	
	switch(a)
	{
		case 1:Factorial.calculate();
		break;
		case 2:Reverse.find();
		break;
		case 3:Prime.search();
		break;
		case 4:c=Time.boo();
		if(c==false)
			System.out.println("not prime");
		else
			System.out.println(" prime");
		break;
		
}
}
}
class Factorial
{
	public static void calculate()
	{
	System.out.println("enter the number ");
	Scanner s=new  Scanner(System.in);
	int n=s.nextInt();
	
	int i;
	long f=1;
	for(i=1;i<=n;i++)
	{
		f=f*i; 
	}
	System.out.println("the fact is "+f);
	
	}
	
	
}
class Reverse
{
	public static void find()
	{
		int rev=0,c;
		System.out.println("enter the number");
		Scanner s=new  Scanner(System.in);
	int a=s.nextInt();
	while(a!=0)
	{
		c=a%10;
		rev=rev*10+c;
		a=a/10;
	}
	System.out.println("the reverse is "+rev);
	}
}
class Prime
{
	public static void search()
	{
		int i;
		System.out.println("enter the number");
		Scanner s=new  Scanner(System.in);
	int a=s.nextInt();
	for(i=2;i<a;i++)
if(a%i==0)
	{
	System.out.println("not prime");
	break;
	}
	else
	{
		System.out.println("prime");
		break;
	}
	}
	
}
class Time
{
	public static boolean boo()
	{
		int i;
		System.out.println("enter the number");
		Scanner s=new  Scanner(System.in);
	int a=s.nextInt();
	for(i=2;i<a;i++)
	{
if(a%i==0)
	return false;
		
	
	}
	return true;
	}
	
}
		
		
		


		
		

