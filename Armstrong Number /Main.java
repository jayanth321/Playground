import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1,n2,temp=n,c=0,sum=1,sum1=0;
      while(n>0){
        n=n/10;
        c++;
      }
      n=temp;
      while(n>0){
        n1=n%10;
        for(int i=0;i<c;i++)
          sum=sum*n1;
        sum1=sum1+sum;
        sum=1;
        n=n/10;
      }
      if(sum1==temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}