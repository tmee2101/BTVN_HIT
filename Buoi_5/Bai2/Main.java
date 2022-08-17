package Bai2;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static PhuongTien xe[];
	private static int n;

	public static void nhap() {
		do {
			System.out.println("Nhap so luong xe: ");
			n = sc.nextInt();
		} while (n <= 0);
		xe = new PhuongTien[n];
		for (int i = 0; i < n; i++) {
			xe[i] = new PhuongTien();
			xe[i].input();
		}
	}

	public static void xuat() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia",
				"Thue phai nop");
		for (int i = 0; i < n; i++)
			xe[i].output();
	}

	public static void sortTax() {
		PhuongTien temp;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n; j++)
				if (xe[i].getTax() < xe[j].getTax()) {
					temp = xe[i];
					xe[i] = xe[j];
					xe[j] = temp;
				}
		xuat();
	}

	public static void sortPrice() {
		PhuongTien temp;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n; j++)
				if (xe[i].getPrice() > xe[j].getPrice()) {
					temp = xe[i];
					xe[i] = xe[j];
					xe[j] = temp;
				}
		xuat();
	}

	public static void main(String[] args) {
		nhap();
		int choose;
		do {
			System.out.println("Nhap lua chon: ");
			choose = sc.nextInt();
		} while (choose < 1 || choose > 4);

		switch (choose) {
		case 1:
			xuat();
			break;
		case 2:
			sortTax();
			break;
		case 3:
			sortPrice();
			break;
		default:
			System.out.println("Exit!");
			break;
		}

	}
}
