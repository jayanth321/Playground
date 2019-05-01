import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    for(int i=1;i<=n;i++){
      System.out.print(i);
      c=c+1;
      if(c%3==0&&i!=n)
        System.out.print(",");
    }
      
  }
}