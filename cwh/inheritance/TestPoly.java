package com.cwh.inheritance;

class Test37 {
	public void display()
	{
		System.out.println("hi");
	}

	public void show()
	{System.out.println("bye");
}
}
class PolyImpl extends Test37{
	
	int a=9;
	public void display(int a)
	{ this.a = a;
		System.out.println("hi how are you");
	}
	public void show2()
	{
		System.out.println("i am fine");
	}
	
	
}

public class TestPoly{
	public static void main()
	{
		Test37 t = new Test37();
	 
		Test37 t2 = new PolyImpl();
		t2.display();
		t.display();
	}

	@Override
	public String toString() {
		return "TestPoly []";
	}
	
}