package headfirst.factory.pizzaaf;

public interface PizzaIngredientFactoryForSeoul
    extends PizzaIngredientFactory {
        public Kimchi createKimchi();
        public Dough createDoughForKimchiPizza();
}