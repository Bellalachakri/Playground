import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int rc=1;rc<=n;rc++)
      {
        for(int cc=1;cc<=n;cc++)
        {
          if((rc==1)||(cc==1)||(rc==n)||(cc==n))
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
          System.out.println();
        }   
	
}}
	
