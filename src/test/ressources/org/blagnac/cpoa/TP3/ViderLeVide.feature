#Author: Thomas
Feature: Vide Chocolate Factory Vide

  Je souhaite être certain que je ne peut pas vider une bouilloir vide.

  Scenario: Trying to vider une bouilloir vide
  Given a controller A
  When  A is vider
  Then  A cannot be vider