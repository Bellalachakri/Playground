import java.util.Scanner;
class Main
{
  public static void main(String arg[])	
  {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int p=in.nextInt();
    int result=1;
 
    if(n>=0&&p==0)
     {
        result=1;
     }
    else if(n==0&&p>=1)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
	 {
            result=result*n;
 	 }	    
     }
    System.out.println(+result);
	
  }
}