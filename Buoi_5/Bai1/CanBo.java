package Bai1;

import java.util.Scanner;

public class CanBo {
	protected int id;
	protected String fullName;
	protected int yearOfBirth;
	protected String gender;
	protected String address;
	static int count = 1;

	CanBo() {
		id = count++;
	}

	public CanBo(String fullName, int yearOfBirth, String gender, String address) {
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		fullName = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		yearOfBirth = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gender = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		address = sc.nextLine();
	}

	public void output() {
		System.out.println("ID: " + id);
		System.out.println("Ho ten: " + fullName);
		System.out.println("Nam sinh: " + yearOfBirth);
		System.out.println("Gioi tinh: " + gender);
		System.out.println("Dia chi: " + address);
	}
}
