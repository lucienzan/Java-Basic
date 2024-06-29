package Model;
import java.util.ArrayList;
public class TeaShop {
	public TeaShop() {
		this.shopName = "Moon Cafe";
		this.TotalCup = 20;
		this.CustomerCount = 0;
		this.StaffCount = 0;
		this.CoffeeTypes = new ArrayList<>();
	}
	final String shopName;
	public int TotalCup;
	public int CustomerCount;
	public int StaffCount;
	public ArrayList<Coffee> CoffeeTypes;
}
