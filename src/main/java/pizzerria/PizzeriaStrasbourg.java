package pizzerria;
import pizza.Pizza;
import pizza.PizzaFromageStyleStrasbourg;
import pizza.PizzaGrecqueStyleStrasbourg;
import pizza.PizzaPoivronsStyleStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria{

	private static PizzeriaStrasbourg pizzeria=new PizzeriaStrasbourg();
	
	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza=null;
		
		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleStrasbourg();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleStrasbourg();
		} else {
			pizza = new PizzaPoivronsStyleStrasbourg();
		}
		
		return pizza;
	}

	public static Pizzeria getInstance() {
		return pizzeria;
	}

}
