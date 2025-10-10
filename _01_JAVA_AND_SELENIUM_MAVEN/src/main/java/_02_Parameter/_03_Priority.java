package _02_Parameter;

import java.security.PublicKey;

import org.testng.annotations.Test;

public class _03_Priority {
	
	@Test(priority = 2)
	public void Cat() {
		System.out.println("Cat");
	}
	
	@Test(priority = 3)
	public void Elephant() {
		System.out.println("Elephant");
	}

	@Test(priority = 1)
	public void Dog() {
		System.out.println("Dog");
		}
	
	@Test(priority = -5)
	public void Banana() {
		System.out.println("Banana");
		}
	
	@Test(priority = -4)
	public void Apple() {
		System.out.println("Apple");
		}
	
}
