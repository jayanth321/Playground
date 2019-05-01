import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int i1=1,i2=1;
      for(int i=0;i<n;i++){
        if(a[i]==n1){
        //  System.out.print("element_1_index = ");
          System.out.println(i);
        //  System.out.println("");
          i1=0;
        }
        if(a[i]==n2){
         // System.out.print("element_1_index = ");
          System.out.println(i);
         // System.out.println("");
          i2=0;
        }
      }
      if(i2==1)
        System.out.println("-1");
      
    }
}