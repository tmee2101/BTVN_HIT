package Bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private String bac;
	static Scanner sc = new Scanner(System.in);

	public CongNhan(String bac) {
		super();
		this.setBac(bac);
	}

	CongNhan() {

	}

	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}

	public void input() {
		super.input();
		System.out.print("Nhap bac: ");
		bac = sc.nextLine();
	}

	public void output() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", id, fullName, yearOfBirth, gender, address, bac);
	}
}
