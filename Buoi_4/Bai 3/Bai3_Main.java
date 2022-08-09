import java.util.Scanner;

public class Bai3_Main {
	public static void main(String[] args) {
		Prime kt = new Prime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap n: ");
		long b = sc.nextLong();
		System.out.println("Nhap c: ");
		float c = sc.nextFloat();
		System.out.println("Nhap d: ");
		double d = sc.nextDouble();
		System.out.println(kt.isPrime(a));
		System.out.println(kt.isPrime(b));
		System.out.println(kt.isPrime(c));
		System.out.println(kt.isPrime(d));
	}
}
