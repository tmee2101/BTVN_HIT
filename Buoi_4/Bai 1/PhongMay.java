import java.util.Scanner;

public class PhongMay {
	private String maPhong;
	private String tenPhong;
	private double dienTich;
	QuanLy x;
	May y;

	PhongMay() {
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma phong: ");
		maPhong = sc.nextLine();
		System.out.print("Nhap ten phong: ");
		tenPhong = sc.nextLine();
		System.out.print("Nhap dien tich: ");
		dienTich = sc.nextDouble();
		x = new QuanLy();
		x.input();
		y = new May();
		y.input();
	}

	public void output() {
		System.out.println("Ma phong: " + maPhong);
		System.out.println("Ten phong: " + tenPhong);
		System.out.println("Dien tich: " + dienTich);
		x.output();
		y.output();
	}
}
