#Author: Thomas
Feature: Toujours la même PizzaFactoryBrest (singleton)

  Je souhaite être certain que je ne peut pas créer deux pizza Factory Brest.

  Scenario: Essayer de créer deux pizza Factory Brest
  Given Une pizzeria Factory
  When Creer deux pizzeria Brest
  When Creer deux pizza Factory Brest
  Then  Deux même pizza Factory Brest