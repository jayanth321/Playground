import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int value=sc.nextInt();
      for(int k=0;k<n-1;k++){
        for(int j=k+1;j<n;j++){
          sum=a[k]+a[j];
          if(sum==value){
            System.out.print(a[k]);
             System.out.print(", ");
             System.out.print(a[j]);
            System.out.println("");
          }
          sum=0;
        }
      }
    }
}