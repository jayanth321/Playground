import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n%10;
      int sum=0;
      sum=sum+n1;
      while(n>0){
        if(n/10==0)
          sum=sum+n;
        n=n/10;
	}
   
      System.out.println(sum);
}
}