package decoratorPattern;

import decoratorPattern.base.BasePizza;
import decoratorPattern.base.Farmhouse;
import decoratorPattern.base.VegDelight;
import decoratorPattern.decorator.ExtraCheese;
import decoratorPattern.decorator.Mushroom;

class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Farmhouse();
        pizza = new Mushroom(pizza);

        System.out.println("Cost of Farmhouse with Mushroom: " + pizza.cost());

        pizza = new ExtraCheese(new Mushroom(new VegDelight()));
        System.out.println("Cost of VegDelight with Mushroom and ExtraCheese: " + pizza.cost());
    }
}