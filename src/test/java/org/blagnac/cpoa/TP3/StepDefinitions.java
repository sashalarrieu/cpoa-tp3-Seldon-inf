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
	private PizzaFactory pizzaFactoryA;
	private PizzaFactory pizzaFactoryB;
	
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
	
	@Given("Deux pizza Factory Brest")
	public void deux_pizza_factory_Brest() {
		pizzaFactoryA=PizzaFactoryBrest.getInstance();
		pizzaFactoryB=PizzaFactoryBrest.getInstance();
	}
	
	@Then("Deux même pizza Factory Brest")
	public void deux_même_pizza_factory_brest() {
	    if(!(pizzaFactoryA.equals(pizzaFactoryB))) {
	    	throw new io.cucumber.java.PendingException("Il ne devrait y avoir que une seule pizza factory brest");
	    }
	}
}
