package headfirst.factory.pizzaaf;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore seoulStore = new SeoulPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");
 
		pizza = seoulStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = seoulStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = seoulStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = seoulStore.orderPizza("kimchi");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
