package Programmonbatch_progeam;

public class Human {
	public  void eat()
	{
		System.out.println("human are eating");
		
	}
}
class Boy extends Human
{
	public void eat()
	{
		System.out.println("boy is eating");
	}

  public static void main(String[]args)
  {
	     Boy b1=new Boy();
	     b1.eat();
  }
}
