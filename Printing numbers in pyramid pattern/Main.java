import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int n1=n,n2=n, l=1;
      for(int k=0;k<n;k++){
      for(int i=1;i<n1;i++)
        System.out.print(" ");
      for(int i=n1;i<=n2;i++){
       System.out.print(l);
        System.out.print(" ");
        l++;
      }
        n1=n1-1;
       
        System.out.println("");
      }
    }    
}