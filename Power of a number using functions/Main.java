import java.util.Scanner;
class Main{
	public static void main (String[] args){
   Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int e=sc.nextInt();
    int sum=power(b,e);
     System.out.println(sum);
  }
  public static int power(int b,int e){
    int sum=1;
   for(int i=1;i<=e;i++)
     sum=sum*b;
   return sum;
  }
}