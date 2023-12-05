import java.util.ArrayList;
import Model.Coffee;
import Model.Hero;
import Model.TeaShop;

public class Tuto2 {
	public static void main(String[] args) {
		
		TeaShop shop1 = new TeaShop();
		shop1.TotalCup = 20;
		shop1.CustomerCount = 30;
		shop1.StaffCount = 12;
		
		ArrayList<Coffee> coffeeList = new ArrayList<>();
		Coffee maker1 = new Coffee();
		maker1.CoffeeName = "Espresso";
		maker1.IsFill = true;
		maker1.Price = 4.6d;
		coffeeList.add(maker1);
		
		Coffee maker2 = new Coffee();
		maker2.CoffeeName = "Cafés Latte";
		maker2.IsFill = true;
		maker2.Price = 3.88d;
		coffeeList.add(maker2);

		shop1.CoffeeTypes.addAll(coffeeList);
		
		Hero hero = new Hero("Batman",34,"fighting skill");
		String info = hero.toString();
		System.out.println(info);
	}
	}
