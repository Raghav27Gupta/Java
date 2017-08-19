class calc
{
static double c;
 public static void main(String args[])
 {
   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[2]);
   String s=args[1];
   if(s.equals("+"))
      c=a+b;
   else if(s.equals("-"))
      c=a-b;
   else if(s.equals("*"))
      c=a*b;
   else if(s.equals("/"))
      c=a/b;
   else
     System.out.println("invalid sign");
   System.out.println(c);
 }
}
