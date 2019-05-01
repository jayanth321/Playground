import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=square(n);
      System.out.println(a);
	} 
  public static int square(int num){
    int s=num*num;
    return s;
  }
}