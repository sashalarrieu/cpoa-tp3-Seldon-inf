package org.blagnac.cpoa.TP3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pizzerria.Pizzeria;
import pizzerria.PizzeriaBrest;
import pizzerria.PizzeriaStrasbourg;

import static org.junit.Assert.*;

public class StepDefinitions {
	
	private Pizzeria pizzeriaA;
	private Pizzeria pizzeriaB;
	
	@Given("Une pizzeria Brest et une pizzerria Brest")
	public void une_pizzeria_Brest_et_une_pizzerria_Brest() {
		pizzeriaA=PizzeriaBrest.getInstance();
		pizzeriaB=PizzeriaBrest.getInstance();
	}
	@Then("Les deux Pizzeria sont les mêmes")
	public void b_cannot_boil() throws Exception {
		if(!(pizzeriaB==pizzeriaA)) {
			throw new Exception("Erreur les deux pizzeria aurez du être les mêmes!");
		}
	}
//	@When("A is ordered to fill and boil")
//	public void a_is_ordered_to_fill_and_boil() {
//		bA.remplir();
//		bA.bouillir();
//	}
//	
//	@Given("a controller A")
//	public void a_controller_a() {
//		pizzeriaA=BouilleurChocolat.getInstance();
//	}
//	@When("A is vider")
//	public void a_is_vider() {
//	    bA.vider();
//	}
//	@Then("A cannot be vider")
//	public void a_cannot_be_vider() throws Exception {
//		if(bA.vider().equals("Vider")) {
//    		throw new Exception("Erreur la bouilloir ne devrait pas pouvoir être vider!");
//    	}
//	}
}
