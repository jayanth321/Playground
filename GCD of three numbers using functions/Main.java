import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    
	 Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int n4=great(n1,n2);
      int n5=great(n4,n3);
      int n6=gcd(n1,n2,n3,n5);
      System.out.println(n6);
	}
  public static int great(int n1,int n2){
    if(n1>n2)
      return n2;
    else
      return n1;
  }
  public static int gcd(int n1,int n2,int n3,int n4){
    int n5=0;
    for(int i=n4;i>=1;i--)
    {
      if(n1%i==0&&n2%i==0&&n3%i==0)
        n5=i;
        break;
    }
    return n5;
}
}