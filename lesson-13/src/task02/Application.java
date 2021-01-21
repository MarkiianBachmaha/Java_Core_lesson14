package task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Натисніть 1, щоб додати товар;");
		System.out.println("Натисніть 2, щоб видалити товар;");
		System.out.println("Натисніть 3, щоб замінити товар;");
		System.out.println("Натисніть 4, щоб сортувати за назвою;");
		System.out.println("Натисніть 5, щоб сортувати за довжиною;");
		System.out.println("Натисніть 6, щоб сортувати за шириною;");
		System.out.println("Натисніть 7, щоб сортувати за вагою;");
		System.out.println("Натисніть 8, щоб вивести елемент колекції;");
		System.out.println("Натисніть 9, щоб вийти з програми;");
	}

	public static void main(String[] args) {

		List<Commodity> commodit = new ArrayList<Commodity>();
		Commodity commodity = new Commodity(null, 0, 0, 0);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {

				Commodity.getinstance().addCommodity();
				System.out.println();
				break;
			}
			case "2": {

				Commodity.getinstance().deleteCommodity();
				System.out.println();
				break;
			}
			case "3": {

				break;
			}
			case "4": {

				Commodity.getinstance().sortByName();
				System.out.println();
				break;
			}
			case "5": {

				Commodity.getinstance().sortByLength();
				System.out.println();
				break;
			}
			case "6": {

				Commodity.getinstance().sortByWidth();
				System.out.println();
				break;
			}
			case "7": {

				Commodity.getinstance().sortByWeight();
				System.out.println();
				break;
			}
			case "8": {

				Commodity.getinstance().showSpecificCommodity();
				System.out.println();
				break;
			}
			case "9": {
				System.out.println("Exit the program.");
				System.exit(0);
				scanner.close();
			}

			}

		}
	}
}