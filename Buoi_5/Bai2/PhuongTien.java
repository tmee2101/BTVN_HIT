package Bai2;

import java.util.Scanner;

public class PhuongTien {
	private static Scanner sc = new Scanner(System.in);
	private String name;
	private String type;
	private int vol;
	private float price;
	private float tax;

	PhuongTien() {

	}

	public float getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void input() {
		System.out.println("Nhap ten chu xe: ");
		name = sc.nextLine();
		System.out.println("Nhap loai xe: ");
		type = sc.nextLine();
		System.out.println("Dung tich: ");
		vol = sc.nextInt();
		System.out.println("Gia tien: ");
		price = sc.nextInt();
		sc.nextLine();
		if (vol < 100)
			tax = price * 0.02f;
		else if (100 <= vol && vol <= 200)
			tax = price * 0.06f;
		else
			tax = price * 0.1f;
	}

	public void output() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", name, type, vol, price, tax);
	}

}
