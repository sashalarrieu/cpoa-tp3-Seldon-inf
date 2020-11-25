#Author: Thomas
Feature: Creer deux même pizzeria Brest

  Je souhaite être certain que je ne peut pas créer deux pizzeria Brest.

  Scenario: Essayer de créer deux pizzeria
  Given Une pizzeria Brest et une pizzerria Brest
  Then  Les deux Pizzeria sont les mêmes