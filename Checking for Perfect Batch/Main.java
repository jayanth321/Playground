import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int sum1=0,sum2=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
    }
    for(int j=0;j<n/2;j++)
      sum1=sum1+a[j];
    for(int k=(n/2)+1;k<n;k++)
      sum2=sum2+a[k];
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    
    else
      System.out.println("Not a Perfect Batch");
  }
}

