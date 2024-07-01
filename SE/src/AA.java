
public class AA  implements runnable
{
public void run()
{
	for (int i=1;i<=5;i++)
	{
		System.out.println("child thread");
	}
}
}
class B
{
	public static void main(String args[])
	{
		Thread t=new Thread("ref");
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread");
			
		}
				
	}
}