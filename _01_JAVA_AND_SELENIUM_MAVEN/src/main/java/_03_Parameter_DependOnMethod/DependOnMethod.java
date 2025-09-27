package _03_Parameter_DependOnMethod;

import org.testng.annotations.Test;

public class DependOnMethod {
	@Test
	public void Apple() {
		System.out.println("Apple");
		}
	
	@Test(dependsOnMethods = "Apple")
	public void Banana() {
		System.out.println("Banana");
		}
	
	@Test(dependsOnMethods = "Banana")
		public void Cat() {
		System.out.println("Cat");
		
	}
	
	@Test(dependsOnMethods = "Cat")
	public void Dog() {
		System.out.println("Dog");
		}
	
	
	@Test(dependsOnMethods = "Dog")
	public void Elephant() {
		System.out.println("Elephant");
		throw new RuntimeException ();	
	}

	}
	
		
		



