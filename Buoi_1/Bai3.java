import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		int t=n;
		for (int i=1; i<n; i++) 
			if (n%i==0) t+=i;
		System.out.println("Tong = "+t);
	}
}
