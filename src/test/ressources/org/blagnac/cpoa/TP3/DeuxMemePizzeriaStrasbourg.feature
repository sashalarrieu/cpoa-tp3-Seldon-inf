#Author: Thomas
Feature: Creer deux même pizzeria Strasbourg

  Je souhaite être certain que je ne peut pas créer deux pizzeria Strasbourg.

  Scenario: Essayer de créer deux pizzeria
  Given Une pizzeria Strasbourg et une pizzerria Strasbourg
  Then  Les deux Pizzeria sont les mêmes