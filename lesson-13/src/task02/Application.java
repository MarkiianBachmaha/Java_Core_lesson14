package task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("�������� 1, ��� ������ �����;");
		System.out.println("�������� 2, ��� �������� �����;");
		System.out.println("�������� 3, ��� ������� �����;");
		System.out.println("�������� 4, ��� ��������� �� ������;");
		System.out.println("�������� 5, ��� ��������� �� ��������;");
		System.out.println("�������� 6, ��� ��������� �� �������;");
		System.out.println("�������� 7, ��� ��������� �� �����;");
		System.out.println("�������� 8, ��� ������� ������� ��������;");
		System.out.println("�������� 9, ��� ����� � ��������;");
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