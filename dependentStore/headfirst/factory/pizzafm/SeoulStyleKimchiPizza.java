package headfirst.factory.pizzafm;

public class SeoulStyleKimchiPizza extends Pizza{
    
    public SeoulStyleKimchiPizza() {
        name = "Seoul Style Kimchi Pizza";
		dough = "Crust Dough Made Of Rice";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Kimchi");
    }
}
