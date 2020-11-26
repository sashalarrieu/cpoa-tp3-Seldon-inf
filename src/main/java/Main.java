import pizza.Pizza;
import pizzerria.PizzeriaStrasbourg;

public class Main {

	public static void main(String[] args) {
		PizzeriaStrasbourg pizzeriaStras=new PizzeriaStrasbourg();
		@SuppressWarnings("unused")
		Pizza pizza = pizzeriaStras.orderPizza("fromage");
	}

}
