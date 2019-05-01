import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=sum(n);
      System.out.println(s);
	}
  public static int sum(int num){
    int s1=((num*(num+1))/2);
    return s1;
  }
}