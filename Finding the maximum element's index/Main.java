import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int l=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int l1=a[0];
    for(int j=0;j<n;j++){
      if(l1>a[j]){
        l=j-3; 
      }
      else{
        l=j;
        l1=a[j];
      }
    }
    
   
       System.out.println(l);
  }
}