package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;
	Scanner sc = new Scanner(System.in);

	NhanVien() {

	}

	public NhanVien(String fullName, int yearOfBirth, String gender, String address, String congViec) {
		super(fullName, yearOfBirth, gender, address);
		this.setCongViec(congViec);
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public void input() {
		super.input();
		System.out.print("Nhap cong viec: ");
		congViec = sc.nextLine();
	}

	public void output() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", id, fullName, yearOfBirth, gender, address, congViec);
	}

}
