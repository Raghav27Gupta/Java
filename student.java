import java.io.*;
class student
{
  public static void main(String args[])throws IOException
  {
   int temp;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int a[]=new int[10];
   String b[]=new String[10];
   for(int i=0;i<10;i++)
   {
    System.out.println("enter the marks of  "+(i+1)+"student");
    a[i]=Integer.parseInt(br.readLine());
   }
   for(int i=0;i<10;i++)
    {
      for(int j=1;j<10-i;j++)
      {
        if(a[j-1]<a[j])
        {
          temp=a[j-1];
          a[j-1]=a[j];
          a[j]=temp;
        }
      }
    }
  for(int i=0;i<10;i++)
   {
     if(a[i]<=50 && a[i]>=40)
        b[i]="PASS";
     else if(a[i]<=75 && a[i]>=51)
        b[i]="MERRIT";
     else if(a[i]>75)
        b[i]="DISTINCTION";
   }
  for(int i=0;i<10;i++)
   {
     System.out.println(a[i]+"             "+b[i]);
  }
}
