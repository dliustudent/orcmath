package guiPlayer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {

	private static ArrayList<Backpacks> list;

	public static void main(String[] args) {
		CatalogMaker b = new CatalogMaker();
		Scanner in = new Scanner(System.in);
		System.out.println(b.getCSVcontent());
		
		System.out.println("Enter the name of your backpack");
		 String name = in.nextLine();
		System.out.println("Enter the price of your backpack");
		 String price = in.nextLine();
		System.out.println("Enter if your backpack is worth it");
		 String worthIt = in.nextLine();

		
		b.addNewItem(name, price, worthIt);
		b.testSaveContent("backpacks.csv");
	}

	public CatalogMaker() {
		list = new ArrayList<Backpacks>();
		list.add(new Backpacks("skullcandy", "25.00", "yes"));
		list.add(new Backpacks("adidas", "150.00", "yes"));
		list.add(new Backpacks("Supreme", "9999.00", "no"));
	}

	public String getCSVcontent() {
		String data = "brand, price, worthIt\n";
		for (Backpacks s : list) {
			data += s + "\n";
		}
		
		return data;
	}

	public void addNewItem(String name, String price, String worthIt) {
		list.add(new Backpacks(name, price, worthIt));
		System.out.println("Item added successfully!");
	}
	
	private void testSaveContent(String fileName) {

		try {

			FileWriter fw = new FileWriter(fileName);

			for(Backpacks c: list){
				fw.write(c+"\n");    	
			}
			fw.close();

			System.out.println("Success! File \"" + fileName + "\" saved!");

		} catch (IOException e) {

			System.out.println(
					"An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");

		}

	}
	

}

