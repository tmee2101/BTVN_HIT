import java.util.Scanner;

public class NhanVien {
	Scanner sc = new Scanner(System.in);
	static private int id = 0;
	private String name;
	private int age;
	private String address;
	private String department;

	public NhanVien() {
	}

	public void input() {
		System.out.print("Nhap ten: ");
		name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap dia chi: ");
		address = sc.nextLine();
		System.out.print("Nhap bo phan: ");
		department = sc.nextLine();
	}

	public void output() {
		id++;
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", id, name, age, address, department);
	}

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		nv1.input();
		System.out.println();

		NhanVien nv2 = new NhanVien();
		nv2.input();
		System.out.println();

		NhanVien nv3 = new NhanVien();
		nv3.input();
		System.out.println();

		NhanVien nv4 = new NhanVien();
		nv4.input();
		System.out.println();

		NhanVien nv5 = new NhanVien();
		nv5.input();
		System.out.println();

		System.out.println("THONG TIN CAC NHAN VIEN");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
		nv1.output();
		nv2.output();
		nv3.output();
		nv4.output();
		nv5.output();

	}
}
