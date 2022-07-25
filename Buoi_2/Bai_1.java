import java.util.Scanner;

public class Bai_1 {
	public static void Average(int[] a, int n) {
		int sum = 0, count = 0;
		for (int i = 0; i < n; i++)
			if ((i % 2 == 0) && (a[i] % 2 == 1)) {
				sum += a[i];
				count += 1;
			}
		if (count != 0)
			System.out.println("TBC so le o vi tri chan la: " + sum / count);
		else
			System.out.println("Khong co so le o vi tri chan trong mang");
	}

	public static void Min(int[] a, int n) {
		int min = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] < min)
				min = a[i];
		System.out.printf("Min = " + min + " tai cac vi tri co i = ");
		for (int i = 0; i < n; i++)
			if (a[i] == min)
				System.out.printf(i + " ");
		System.out.println();
	}

	public static boolean squareNumber(int x) {
		int i = (int) Math.sqrt(x);
		if (x < 1)
			return false;
		if (Math.pow(i, 2) == x)
			return true;
		else
			return false;
	}

	public static void displaySquareNum(int[] a, int n) {
		boolean ktra = false;
		for (int i = 0; i < n; i++)
			if (squareNumber(a[i])) {
				ktra = true;
				break;
			}
		if (ktra) {
			System.out.printf("So chinh phuong co trong mang: ");
			for (int i = 0; i < n; i++)
				if (squareNumber(a[i]))
					System.out.printf(a[i] + " ");
			System.out.println();
		} else
			System.out.println("Trong mang khong co so chinh phuong");
	}

	public static boolean primeNumber(int x) {
		if (x <= 1)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(x); i++)
				if (x % i == 0)
					return false;
			return true;
		}
	}

	public static void displayPrimeNum(int[] a, int n) {
		boolean ktra = false;
		for (int i = 0; i < n; i++)
			if (primeNumber(a[i])) {
				ktra = true;
				break;
			}
		if (ktra) {
			System.out.printf("So nguyen to co trong mang: ");
			for (int i = 0; i < n; i++)
				if (primeNumber(a[i]))
					System.out.printf(a[i] + " ");
			System.out.println();
		} else
			System.out.println("Trong mang khong co so nguyen to");
	}

	public static void sort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		System.out.println("Mang sau khi sap xep: ");
		for (int i = 0; i < n; i++)
			System.out.printf(a[i] + " ");
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Nhap so phan tu cua mang: ");
			n = sc.nextInt();
		} while (n < 1);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = sc.nextInt();
		}
		Average(a, n);
		Min(a, n);
		displaySquareNum(a, n);
		displayPrimeNum(a, n);
		sort(a, n);
	}
}
