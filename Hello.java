
public class Hello {

	public static main(String[] args) 
	{
		Hello hello = new Hello();
		hello.methodA();
		hello.methodB();
		hello.methodC();
	}

	public void methodA(void ) {
		System.out.println("Hello User B");
	}

	public void methodB(void) {
            System.out.println("hello\n");
	}

	public void methodC(void) { 
            System.out.println("User B's changes to this method\n");
	    System.out.println("User A's changes to this method");
	}

}