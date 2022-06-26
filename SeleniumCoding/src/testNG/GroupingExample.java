package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	@Test(groups = "Apple")
	public void applePhone1() {
		System.out.println("Apple");
	}
	@Test(groups = "Apple")
	public void applePhone2() {
		System.out.println("Apple");
	}
	@Test(groups = "Moto")
	public void motoPhone1() {
		System.out.println("Moto");
	}
	@Test(groups = "Moto")
	public void motoPhone2() {
		System.out.println("Moto");
	}
	@Test(groups = "Vivo")
	public void vivoPhone1() {
		System.out.println("Vivo");
	}
	@Test(groups = "Vivo")
	public void vivoPhone2() {
		System.out.println("Vivo");
	}
	@Test(groups = "Lenovo")
	public void lenovoPhone1() {
		System.out.println("Lenovo");
	}
	@Test(groups = "Lenovo")
    public void lenovoPhone2() {
		System.out.println("Lenovo");
	}
}
