
public class ImP {
	
	package zzz;
	public class A
	{
	   String n="abc";
	   public void print()
	  {
	    System.out.println(n);
	  }
	}

	// importing package
	import zzz.*;
	class B extends A
	{
	   public static void main(String args[])
	   {
	     A a=new A();
	     a.print();
	   }
	}

}
