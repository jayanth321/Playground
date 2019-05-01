import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int temp,sum=0;
      int n=sc.nextInt();
      while(n>0){
         temp=n%10;
        sum=sum+temp;
        n=n/10;
	}
      System.out.println(sum);
}
}