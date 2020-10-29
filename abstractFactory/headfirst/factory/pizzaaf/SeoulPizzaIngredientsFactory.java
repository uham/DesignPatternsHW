package headfirst.factory.pizzaaf;

public class SeoulPizzaIngredientsFactory implements PizzaIngredientFactoryForSeoul {

    public Dough createDough() {
		return new CrustDough();
	}
 
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
 
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
            new RedPepper(), 
            new Mushroom() };
            return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new JejuClams();
    }
    
    public Kimchi createKimchi() {
        return new KoreanTraditionalKimchi();
	}
	
	public Dough createDoughForKimchiPizza()
	{
		return new RiceCrustDough();
	}
}
