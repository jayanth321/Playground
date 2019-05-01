import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=1,sum1=0;
      int temp=n;
      while(n>0){
         int n1=n%10;
         for(int i=1;i<=n1;i++)
           sum=sum*i;
        n=n/10;
        sum1=sum1+sum;
        sum=1;
      }
      if(temp==sum1)
         System.out.println("Yes");
      else
        System.out.println("No");
	}
}