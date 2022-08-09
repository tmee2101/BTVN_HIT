import java.util.Scanner;

public class Bai2_Main {
	public static void main(String[] args) {
		int x, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien: ");
		n = sc.nextInt();
		Student[] student = new Student[n];

		for (int i = 0; i < n; i++) {
			student[i] = new Student();
			student[i].input();
		}

		System.out.println("Nhap lua chon: ");
		x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("THONG TIN SINH VIEN");
			for (int i = 0; i < n; i++)
				student[i].output();
			break;

		case 2:
			System.out.println("Nhap id sinh vien can tim: ");
			sc.nextLine();
			String idsv = sc.nextLine();
			int temp = 0;
			for (int i = 0; i < n; i++)
				if (student[i].getId().equals(idsv)) {
					student[i].output();
					break;
				} else
					temp += 1;
			if (temp == n)
				System.out.println("Khong co sv nay!");

			break;

		case 3:
			int count = 0;
			for (int i = 0; i < n; i++)
				if (student[i].diaChi.getProvince().equals("Thanh Hoa")) {
					student[i].diaChi.setProvince("Hai Phong");
					student[i].output();
					count++;
				}
			if (count == 0)
				System.out.println("Khong co sinh vien Thanh Hoa nao!");
			break;

		case 4:
			System.out.println("Nhap id sinh vien can tim: ");
			sc.nextLine();
			String id = sc.nextLine();
			for (int i = 0; i < n; i++) {
				if (student[i].getId().equals(id)) {
					for (int j = i; j < n - 1; j++)
						student[j] = student[j + 1];
				}
				i--;
				n--;
			}
			for (int i = 0; i < n; i++)
				student[i].output();
			break;
		default:
			System.out.println("Khong co lua chon nay!");
		}
	}
}
