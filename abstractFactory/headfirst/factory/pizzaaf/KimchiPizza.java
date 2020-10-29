package headfirst.factory.pizzaaf;

public class KimchiPizza extends Pizza {
    PizzaIngredientFactoryForSeoul ingredientFactory;
    Kimchi kimchi;
 
	public KimchiPizza(PizzaIngredientFactoryForSeoul ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDoughForKimchiPizza();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		kimchi = ingredientFactory.createKimchi();
    }
    
    public String toString()
    {
		StringBuffer result = new StringBuffer(super.toString());

		if(kimchi != null) {
			result.append(kimchi);
			result.append("\n");
		}

		return result.toString();
    }
}
