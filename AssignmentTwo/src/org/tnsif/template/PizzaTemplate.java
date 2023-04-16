package org.tnsif.template;

public abstract class PizzaTemplate {
	 
	//Sub class can not override this template method
	public final void preparePizza() {
		/* Methods Oder of Execution is 
		 Fixed in Template Method*/
		selectBread();
		addingIngredients();
		cooking();
		addingCheese();
		addingTopinngs();
	}
	
	/*Implementation of selectBread & addingIngredients
	 Sub Class has to provide*/
	public abstract void selectBread();
	public abstract void addingIngredients();
	
	//Optionally can be overridden by Sub Class
	public void cooking() {
		System.out.println("Cooking Pizza for 15 minutes!");
	}
 
	//Optionally can be overridden by Sub Class
	public void addingTopinngs() {
		System.out.println("Adding Topinngs in Pizza");
	}
 
	//Optionally can be overridden by Sub Class
	public final void addingCheese() {
		System.out.println("Adding Cheese in Pizza");
	}
}
