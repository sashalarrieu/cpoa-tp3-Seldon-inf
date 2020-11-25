package java.org.blagnac.cpoa.TP3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import BouilleurChocolat.BouilleurChocolat;
import BouilleurChocolat.BouilleurChocolatTest;

public class StepDefinitions {
	
	private BouilleurChocolat bA;
	private BouilleurChocolat bB;
	
	@Given("a controller A and a controller B")
	public void a_controller_a_and_a_controller_b() {
		bA=BouilleurChocolat.getInstance();
		bB=BouilleurChocolat.getInstance();
	}
	@When("A is ordered to fill and boil")
	public void a_is_ordered_to_fill_and_boil() {
		bA.remplir();
		bA.bouillir();
	}
	@Then("B cannot boil")
	public void b_cannot_boil() throws Exception {
    	if(bB.bouillir().equals("Bouillir")) {
    		throw new Exception("Erreur la bouilloir ne devrait pas pouvoir être bouillir!");
    	}
	}
	@Given("a controller A")
	public void a_controller_a() {
		bA=BouilleurChocolat.getInstance();
	}
	@When("A is vider")
	public void a_is_vider() {
	    bA.vider();
	}
	@Then("A cannot be vider")
	public void a_cannot_be_vider() throws Exception {
		if(bA.vider().equals("Vider")) {
    		throw new Exception("Erreur la bouilloir ne devrait pas pouvoir être vider!");
    	}
	}
}
