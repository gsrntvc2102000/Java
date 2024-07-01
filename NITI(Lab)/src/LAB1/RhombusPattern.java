package LAB1;

import java.io.*;
public class RhombusPattern
{
    public static void main(String args[]) throws IOException
    {
           int i,j,limit;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the limit");
           limit=Integer.parseInt(br.readLine());

           for(i=1;i<=limit;i++)
           {
             for(j=limit-i;j>0;j--)
                System.out.print(" ");

             for(j=1;j<=2*i-1;j++)
                System.out.print("*");
             System.out.println();
           }

           for(i=limit-1;i>=1;i--)
            {
               for(j=1;j<=limit-i;j++)
                    System.out.print(" ");
               for(j=1;j<=2*i-1;j++)
                   System.out.print("*");
              System.out.println(); 
            }
    }
}