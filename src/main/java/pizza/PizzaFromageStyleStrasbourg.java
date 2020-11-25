package pizza;
import java.util.ArrayList;

public class PizzaFromageStyleStrasbourg extends Pizza{

	public PizzaFromageStyleStrasbourg() {
		this.nom="Pizza pâte style Strasbourg et fromage";
		this.pate="";
		this.sauce="";
		this.garnitures=new ArrayList<String>();
		this.garnitures.add("Mozzarella en lamelles");
	}
	

	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}

	@Override
	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}

	@Override
	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}
}
