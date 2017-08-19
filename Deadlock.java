class A
{
	synchronized public void d1() 
	{
		System.out.println("Hello World!   D1");
		b.m1();
	}
		synchronized public void m1() 
	{
		System.out.println("Hello World!   m1");
		
	}
}
class B extends A
{
	synchronized public void d2()  
	{
		System.out.println("Hello World!    D2");
		a.m1();
	}
	synchronized public void m2() 
	{
		System.out.println("Hello World!");
		
	}
}
class Dead extends Thread
{
	
		A a=new A();
		B b=new B();
		

		public void run()
		{
			b.d2();
			a.d1();


		}




	
}

class Deadlock 
{
public static void main(String ... a)
	{
		Dead t1=new Dead();
		Dead t2=new Dead();
		t1.start();
		t2.start();

	}
}