package task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Commodity {

	private String name;
	private int length;
	private int width;
	private int weight;
	Scanner scanner;
	List<Commodity> commodity = new ArrayList<Commodity>();

	public Commodity(String name, int length, int width, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public Commodity(String name) {
		super();
	}

	public Commodity() {
		// TODO Auto-generated constructor stub
	}

	private static Commodity instance;

	public static Commodity getinstance() {
		if (instance == null) {
			instance = new Commodity();
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Comodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	private Commodity checkCommodity() {
		Commodity commodityDefault = new Commodity(null);
		boolean flag = false;
		showAllCommodities();

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String commodityName = "";
			if (scanner.hasNext()) {
				commodityName = scanner.next();
			}

			if (commodity.size() > 0) {
				Iterator<Commodity> iterator = commodity.iterator();

				while (iterator.hasNext()) {
					Commodity commodity = iterator.next();

					if (commodity.getName().toString().equalsIgnoreCase(commodityName)) {
						commodityDefault = commodity;
						flag = true;
					}
				}
			}

			else if (commodity.size() == 0) {
				System.out.println("The product is missing;");
				break;
			}
			if (!flag) {
				System.out.println("There is no product with this name;");
			} else {
				break;
			}
		}

		return commodityDefault;
	}

	public void addCommodity() {
		System.out.println("Adding commodity:");

		System.out.println("Enter name:");
		scanner = new Scanner(System.in);

		if (scanner.hasNext()) {
			name = scanner.next();
		}

		System.out.println("Enter length:");
		scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			length = scanner.nextInt();
		}

		System.out.println("Enter width:");
		scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			width = scanner.nextInt();
		}

		System.out.println("Enter weight:");
		scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			weight = scanner.nextInt();
		}

		Commodity commodity1 = new Commodity(name, length, length, length);
		commodity.add(commodity1);

	}

	public void deleteCommodity() {
		System.out.println("Removing commodity (enter name of commodity from list below):");
		showAllCommodities();

		while (true) {
			System.out.println("Enter name of commodity:");
			scanner = new Scanner(System.in);

			if (scanner.hasNext()) {
				name = scanner.next();

				break;

			}
		}

		Iterator<Commodity> iterator = commodity.iterator();

		while (iterator.hasNext()) {
			Commodity commodity = iterator.next();

			if (commodity.getName().equalsIgnoreCase(name)) {
				System.out.println(commodity.toString() + " was deleted;");
				iterator.remove();
			}

		}
	}

	/*
	 * public void replaceCommodity() { System.out.println("Replacing commodity");
	 * 
	 * while (true) { System.out.println("Enter name of commodity:"); scanner = new
	 * Scanner(System.in);
	 * 
	 * if (scanner.hasNext()) { name = scanner.next();
	 * 
	 * break;
	 * 
	 * } }
	 * 
	 * Iterator<Commodity> iterator = commodity.iterator();
	 * 
	 * while (iterator.hasNext()) { Commodity commodity = iterator.next();
	 * 
	 * if (commodity.getName().equalsIgnoreCase(name)) {
	 * System.out.println("Enter name:"); commodity.setName(name);
	 * System.out.println("Enter length:"); commodity.setLength(length);
	 * System.out.println("Enter width:"); commodity.setWidth(width);
	 * System.out.println("Enter :"); commodity.setWeight(weight);
	 * 
	 * System.out.println(commodity.toString() + "was replaced"); }
	 * 
	 * } }
	 */

	public void sortByName() {
		System.out.println("Sorting the product by name:");
		Collections.sort(commodity, new CommodityNameComparator());

		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
	}

	public void sortByLength() {
		System.out.println("Sorting the product by length:");
		Collections.sort(commodity, new CommodityLengthComparator());

		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
	}

	public void sortByWidth() {
		System.out.println("Sorting the product by width:");
		Collections.sort(commodity, new CommodityWidthComparator());

		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
	}

	public void sortByWeight() {
		System.out.println("Sorting the product by weight:");
		Collections.sort(commodity, new CommodityWeightComparator());

		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
	}

	public void showSpecificCommodity() {
		System.out.println("Specific commodity from the storage:");

		Commodity commodity = checkCommodity();
		System.out.println(commodity.getName().toString() + " present on the storage;");
	}

	public void showAllCommodities() {
		System.out.println("All commodities in the storage:");
		Iterator<Commodity> iterator = commodity.iterator();

		while (iterator.hasNext()) {
			Commodity commodity = iterator.next();

			System.out.println(commodity.getName().toString());
		}
	}

}