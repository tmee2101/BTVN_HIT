import java.util.Scanner;

public class HinhChuNhat {
	static Scanner sc = new Scanner(System.in);
	private double length;
	private double width;

	public void input() {
		System.out.print("Nhap chieu dai: ");
		length = sc.nextDouble();
		System.out.print("Nhap chieu rong: ");
		width = sc.nextDouble();

	}

	public HinhChuNhat() {
	}

	public HinhChuNhat(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public double getArea() {
		return length * width;
	}

	public void output() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Area: " + getArea());
	}

	public static void main(String[] args) {
		HinhChuNhat a = new HinhChuNhat();
		System.out.println("Nhap thong tin hinh chu nhat a: ");
		a.input();
		a.output();

		HinhChuNhat b = new HinhChuNhat();
		System.out.println("Nhap thong tin hinh chu nhat b: ");
		System.out.print("Nhap chieu dai: ");
		b.setLength(sc.nextDouble());
		System.out.print("Nhap chieu rong: ");
		b.setWidth(sc.nextDouble());
		b.output();

		if (a.getArea() > b.getArea())
			System.out.println("Hinh chu nhat a co dien tich lon hon");
		else if (a.getArea() < b.getArea())
			System.out.println("Hinh chu nhat b co dien tich lon hon");
		else
			System.out.println("Hai hinh chu nhat co dien tich bang nhau");
	}

}
