package org.tnsif.template;

public class NonVegPizza extends PizzaTemplate {
	 
	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for NonVeg-Pizza!!");
	}
 
	@Override
	public void addingIngredients() {
		System.out.println("Adding ingredients in NonVeg-Pizza!!");
	}
}