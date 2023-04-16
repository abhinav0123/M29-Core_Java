package org.tnsif.template;

public class VegPizza extends PizzaTemplate {
	 
	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for Veg-Pizza!!");
	}
 
	@Override
	public void addingIngredients() {
		System.out.println("Adding ingredients in Veg-Pizza!!");
	}
}
