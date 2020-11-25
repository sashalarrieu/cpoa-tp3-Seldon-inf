package pizzerria;
import pizza.Pizza;
import pizza.PizzaFromageStyleBrest;
import pizza.PizzaGrecqueStyleBrest;
import pizza.PizzaPoivronsStyleBrest;

public class PizzeriaBrest extends Pizzeria{

	private static PizzeriaBrest pizzeria=new PizzeriaBrest();

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza=null;
		
		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleBrest();
		} else {
			pizza = new PizzaPoivronsStyleBrest();
		}
		
		return pizza;
	}

	public static Pizzeria getInstance() {
		return pizzeria;
	}

}
