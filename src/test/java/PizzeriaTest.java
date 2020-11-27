import static org.junit.Assert.*;

import org.junit.Test;

import classes.Pizza;
import classes.Pizzeria;
import classes.PizzeriaBrest;
import classes.PizzeriaStrasbourg;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizza miam = boutiqueBrest.orderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
        Pizza miam1 = boutiqueBrest.orderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.orderPizza ("Greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
}