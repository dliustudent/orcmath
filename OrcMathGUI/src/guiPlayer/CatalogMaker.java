package guiPlayer;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding;
import javax.swing.plaf.SliderUI;

public class CatalogMaker {

	private static ArrayList<Backpacks> list;

	public static void main(String[] args) {
		list = new ArrayList<Backpacks>();
		CatalogMaker b = new CatalogMaker();
		System.out.println(b.getCSVcontent());

	}

	public CatalogMaker() {
		list.add(new Backpacks("skullcandy", 25.00, true));
		list.add(new Backpacks("adidas", 150.00, false));
		list.add(new Backpacks("Supreme", 9999.00, false));
	}

	public String getCSVcontent() {
		String data = "brand, price, worthIt\n";
		String a = "";
		for (Backpacks d : list) {
			a = data + d + "\n";

		}
		return a;
	}

	public void addNewItem(String name, int price, boolean worthIt) {
		list.add(new Backpacks(name, price, worthIt));
		System.out.println("Item added successfully!");
	}
	
	public void Adder() {
		System.out.println("Enter a backpack");
		String backpack = nextLine();
		System.out.println("Enter a price");
		double price = ;
	}
}
