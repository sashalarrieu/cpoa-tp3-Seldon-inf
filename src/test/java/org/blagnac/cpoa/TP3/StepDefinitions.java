package org.blagnac.cpoa.TP3;

import classes.PizzaFactory;
import classes.PizzaFactoryBrest;
import classes.Pizzeria;
import classes.PizzeriaBrest;
import classes.PizzeriaFactory;
import classes.PizzeriaStrasbourg;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	private Pizzeria pizzeriaA;
	private Pizzeria pizzeriaB;
	private PizzeriaFactory pizzeriaFactoryA;
	private PizzeriaFactory pizzeriaFactoryB;
	
	@Given("Deux pizzeria Factory")
	public void deux_pizzeria_factory() {
		pizzeriaFactoryA=PizzeriaFactory.getInstance();
		pizzeriaFactoryB=PizzeriaFactory.getInstance();
	}

	@Then("Deux même pizzeria Factory")
	public void deux_même_pizzeria_factory() {
	    if(!(pizzeriaFactoryA.equals(pizzeriaFactoryB))) {
	    	throw new io.cucumber.java.PendingException();
	    }
	}
	
	@Given("Une pizzeria Factory")
	public void une_pizzeria_factory() {
		pizzeriaFactoryA=PizzeriaFactory.getInstance();
	}

	@When("Creer deux pizzeria Brest")
	public void creer_deux_pizzeria_brest() {
		pizzeriaA = pizzeriaFactoryA.create("brest");
		pizzeriaB = pizzeriaFactoryA.create("brest");
	}
	
	
	
	@Then("Deux même pizza Factory Brest")
	public void deux_même_pizza_factory_brest() {
	    if(!(pizzeriaA.equals(pizzeriaB))) {
	    	throw new io.cucumber.java.PendingException("Il ne devrait y avoir que une seule pizza factory brest");
	    }
	}
}
