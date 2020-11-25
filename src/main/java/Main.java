import pizza.Pizza;
import pizzerria.PizzeriaStrasbourg;

public class Main {

	public static void main(String[] args) {
		PizzeriaStrasbourg pizStras=new PizzeriaStrasbourg();
		Pizza pizza = pizStras.commanderPizza("fromage");
	}

}
