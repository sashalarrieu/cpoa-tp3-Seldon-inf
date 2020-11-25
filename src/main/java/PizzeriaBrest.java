
public class PizzeriaBrest extends Pizzeria{

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

}
