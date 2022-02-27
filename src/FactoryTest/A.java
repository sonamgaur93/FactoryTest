package FactoryTest;

public class A {
	
	 
	A(){
		System.out.println("private constructor");
	}

	static A getA(){//static factory method

		System.out.println("factory method ");
		return new A();
	}
	

public void msg(){  
    System.out.println("hello user");  
}  

}
