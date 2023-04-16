package org.tnsif.template;

public class ClientTest {

	public static void main(String[] args) {
		PizzaTemplate pizzaTemplate = new VegPizza();
		pizzaTemplate.preparePizza();
		
		System.out.println("----------------------------------");
		
		pizzaTemplate = new NonVegPizza();
		pizzaTemplate.preparePizza();
	}

}
