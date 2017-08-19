import java.util.Scanner;
class Reservation implements Runnable
{
	static int tickets=10;

	public void run()
	{
		System.out.println("Total tickets available: "+tickets);
		available();
	}

	void available()
	{	
		int n;
		Scanner CIN=new Scanner(System.in);
		System.out.println("Tickets you want to buy: ");
		n=CIN.nextInt();
		if((n<=tickets)&&(tickets>0))
		{	
			System.out.println("Tickets booked for "+Thread.currentThread());
			tickets=tickets-n;
			System.out.println("Tickets available: "+tickets);
		}
		else
			System.out.println("Tickets not available");
	}
}
class Booking
{
	public static void main(String[] args)
	{
		Thread  t1=new Thread(new Reservation(),"TicketBook1");
		t1.start();
	
		Thread  t2=new Thread(new Reservation(),"TicketBook2");
		t2.start();
	}
}