import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	String nom;
	String pate;
	String sauce;
	ArrayList<String> garnitures;
	
	
	
	public void preparer() {
		System.out.println("Préparation de "+this.nom);
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures:");
		for(String garniture:this.garnitures) {
			System.out.println(" "+garniture);
		}
	}

	public abstract void cuire();

	public abstract void couper();

	public abstract void emballer();

	public String getNom() {
		return nom;
	}


}
