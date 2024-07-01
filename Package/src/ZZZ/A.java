package ZZZ;

public class A
{
	String n="abc";
	   public void print()
	  {
	    System.out.println(n);
	  }
	}

class B extends A
	{
	   public static void main(String args[])
	   {
	     A a=new A();
	     a.print();
	   }
}
