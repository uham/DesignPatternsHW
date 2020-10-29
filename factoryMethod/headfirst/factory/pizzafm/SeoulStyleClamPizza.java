package headfirst.factory.pizzafm;

public class SeoulStyleClamPizza extends Pizza {
    
    public SeoulStyleClamPizza() { 
		name = "Seoul Style Clam Pizza";
		dough = "Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Fresh Clams from Jeju island");
	}
}
