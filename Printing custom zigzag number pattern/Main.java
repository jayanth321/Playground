import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i1=1,i2=2;
      for(int i=1;i<=n;i++){
          if(i%2==1){
             for(int j=1;j<n;j++)
               System.out.print(i1);
            System.out.print(i1+1);
            i1=i1+2;;
          }
         else{
           System.out.print(i2+1);
             for(int k=2;k<=n;k++)
               System.out.print(i2);
           i2=i2+2;
            
          }
        System.out.println("");
      }
        
        
	}
}
