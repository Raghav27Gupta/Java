class commandcalc 
{
	public static void main(String[] a) 
	{
		double z = 0;
	double x=Double.parseDouble(a[0]);
	String s =a[1];
	double y=Double.parseDouble(a[2]);
	

	if(s.equals("+"))
	{
		z=x+y;
	}
	else if(s.equals("-"))
	{
		 z=x-y;
	}
	else if(s.equals("*"))
	{
		 z=x*y;
	}
	else
	
		z=x/y;
	
	System.out.println("ans is "+z);
}
}

