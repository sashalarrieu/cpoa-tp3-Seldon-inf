package pizza;
import java.util.ArrayList;

public class PizzaFromageStyleBrest extends Pizza{

	public PizzaFromageStyleBrest() {
		this.nom="Pizza sauce style brest et fromage";
		this.pate="";
		this.sauce="";
		this.garnitures=new ArrayList<String>();
		this.garnitures.add("Parmigiano reggiano râpé");
	}

	@Override
	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}
	
	@Override
	public void couper() {
		System.out.println("Découpage en parts triangulaires");
	}

	@Override
	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}

	
	
}
