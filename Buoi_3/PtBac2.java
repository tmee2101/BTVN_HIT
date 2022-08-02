import java.util.Scanner;

public class PtBac2 {
	private double a;
	private double b;
	private double c;
	static Scanner sc = new Scanner(System.in);

	public PtBac2() {
	}

	public void input() {
		System.out.print("a = ");
		a = sc.nextDouble();
		System.out.print("b = ");
		b = sc.nextDouble();
		System.out.print("c = ");
		c = sc.nextDouble();
	}

	public void tinhNghiem() {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
			System.out.println("=> PT vo nghiem");
		else if (delta == 0)
			System.out.println("=> PT co nghiem kep x1 = x2 = " + (-b / (2 * a)));
		else {
			double x1 = (-b - Math.sqrt(delta)) / (2 * a);
			double x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("PT co 2 nghiem: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}

	public void output() {
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
		tinhNghiem();
	}

	public static void main(String[] args) {
		PtBac2 a = new PtBac2();
		a.input();
		a.output();
	}
}
