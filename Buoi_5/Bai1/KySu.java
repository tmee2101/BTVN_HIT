package Bai1;

import java.util.Scanner;

public class KySu extends CanBo {
	private String major;
	static Scanner sc = new Scanner(System.in);

	KySu() {

	}

	public KySu(String fullName, int yearOfBirth, String gender, String address, String major) {
		super(fullName, yearOfBirth, gender, address);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void input() {
		super.input();
		System.out.print("Nhap nganh dao tao: ");
		major = sc.nextLine();
	}

	public void output() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", id, fullName, yearOfBirth, gender, address, major);
	}
}
