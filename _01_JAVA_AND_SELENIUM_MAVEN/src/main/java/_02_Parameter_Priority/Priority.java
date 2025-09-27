package _02_Parameter_Priority;

import java.security.PublicKey;

import org.testng.annotations.Test;

public class Priority {
	@Test
	public void SingOut() {
		System.out.println("SingOut");
	}
	
	@Test
	public void AddToChart() {
		System.out.println("AddToChart");
	}

	@Test
	public void SingIn() {
		System.out.println("SingIn");
		}
	
	@Test
	public void SingUp() {
		System.out.println("SingUp");
		}
	
	@Test
	public void SearchProduct() {
		System.out.println("SearchProduct");
		}
	
}
