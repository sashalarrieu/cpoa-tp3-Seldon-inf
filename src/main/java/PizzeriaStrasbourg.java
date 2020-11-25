
public class PizzeriaStrasbourg extends Pizzeria{

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

}
