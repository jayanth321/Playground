import java.util.Scanner;
class Main{
    public static void main(String args[]){
      int l=0;
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        l=a[0];
      for(int i=0;i<n;i++){
        if(a[i]>l)
          l=a[i];
      }
      
      System.out.println(l);
      
    }
}