package headfirst.factory.pizzaaf;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

	void bake()
	{
		if(ingredientFactory != null && ingredientFactory instanceof ChicagoPizzaIngredientFactory) {
			System.out.println("Bake for 50 minutes at 350");
		} else {
			super.bake();
		}
	}
}
