import java.util.Scanner;
class Main{
	public static void main (String[] args){
	       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int rc=1;rc<=n;rc++)
      {
        for(int cc=1;cc<=n;cc++)
        {
          if((rc%2==0)&&(cc==1)||(rc%2==1)&&(cc==n))
          {
            System.out.print(rc+1);
          }
          else
          {
            System.out.print(rc);
          }
        }
          System.out.println();
        }   
	
}}
	

	