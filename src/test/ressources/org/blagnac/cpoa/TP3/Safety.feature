#Author: JMB
Feature: Safe Chocolate Factory

  As a controller, I want to garanty that I am the only one controlling my physical Boiler so that the Boiler cannot get contradictory orders.

  Scenario: Trying to create 2 controllers
  Given a controller A and a controller B
  When  A is ordered to fill and boil
  Then  B cannot boil