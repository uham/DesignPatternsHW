package headfirst.factory.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {

		Pizza pizza;

		DependentPizzaStore dependentPizzaStore = new DependentPizzaStore();
 
		pizza = dependentPizzaStore.createPizza("Seoul", "kimchi");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("Seoul", "cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("Seoul", "clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("Seoul", "veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	}
}
