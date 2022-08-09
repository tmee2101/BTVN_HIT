import java.util.Scanner;

public class QuanLy {
	private String maQL;
	private String hoTen;

	QuanLy() {

	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma QL: ");
		maQL = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
	}

	public void output() {
		System.out.println("Ma QL: " + maQL);
		System.out.println("Ho ten: " + hoTen);
	}
}
