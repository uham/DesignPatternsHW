package headfirst.factory.pizzafm;

public class SeoulStyleVeggiePizza extends Pizza{
    
    public SeoulStyleVeggiePizza() {
        name = "Seoul Style Veggie Pizza";
		dough = "Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
    }
}