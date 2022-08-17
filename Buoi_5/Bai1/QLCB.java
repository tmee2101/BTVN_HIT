package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<CongNhan> listCN = new ArrayList<>();
	public static ArrayList<NhanVien> listNV = new ArrayList<>();
	public static ArrayList<KySu> listKS = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("1: Add 1 can bo vao list tuong ung");
		System.out.println("2: Hien thi danh sach cac can bo");
		System.out.println("3: Xoa 1 can bo theo id");
		System.out.println("4: Tim kiem 1 can bo theo id");
		System.out.println("5: Dung chuong trinh");

		int i;
		do {
			System.out.print("Nhap lua chon: ");
			i = sc.nextInt();
		} while (i < 1 || i > 5);

		switch (i) {
		case 1:
			add();
			break;
		case 2:
			output();
			break;
		case 3:
			delete();
			break;
		case 4:
			search();
			break;
		default:
			System.out.println("Ket thuc!");
			break;
		}
	}

//them 1 can bo
	public static void add() {
		int choose;
		do {
			System.out.println("1: Them cong nhan \n2: Them nhan vien \n3: Them ky su");
			choose = sc.nextInt();
		} while (choose < 1 || choose > 3);

		switch (choose) {
		case 1:
			CongNhan congNhan = new CongNhan();
			congNhan.input();
			listCN.add(congNhan);
			break;
		case 2:
			NhanVien nhanVien = new NhanVien();
			nhanVien.input();
			listNV.add(nhanVien);
			break;
		default:
			KySu kySu = new KySu();
			kySu.input();
			listKS.add(kySu);
			break;
		}
	}

//	hien thi
	public static void output() {
		if (listNV.isEmpty() && listCN.isEmpty() && listKS.isEmpty())
			System.out.println("DS trong!");
		else {
			if (!listCN.isEmpty()) {
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "ID", "Ho ten", "Nam sinh", "Gioi tinh",
						"Dia chi", "Bac");
				for (int i = 0; i < listCN.size(); i++)
					listCN.get(i).output();
			}
			if (!listNV.isEmpty()) {
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "ID", "Ho ten", "Nam sinh", "Gioi tinh",
						"Dia chi", "Cong viec");
				for (int i = 0; i < listNV.size(); i++)
					listNV.get(i).output();
			}
			if (!listKS.isEmpty()) {
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "ID", "Ho ten", "Nam sinh", "Gioi tinh",
						"Dia chi", "Nganh dao tao");
				for (int i = 0; i < listKS.size(); i++)
					listKS.get(i).output();
			}
		}
	}

//	xoa 
	public static void delete() {
		if (listNV.isEmpty() && listCN.isEmpty() && listKS.isEmpty())
			System.out.println("DS trong!");
		else {
			System.out.print("Nhap id can xoa: ");
			int idx = sc.nextInt();
			for (CongNhan cn : listCN)
				if (cn.id == idx)
					listCN.remove(cn);
			for (NhanVien nv : listNV)
				if (nv.id == idx)
					listNV.remove(nv);
			for (KySu ks : listKS)
				if (ks.id == idx)
					listKS.remove(ks);
			output();
		}
	}

//	tim kiem
	public static void search() {
		if (listNV.isEmpty() && listCN.isEmpty() && listKS.isEmpty())
			System.out.println("DS trong!");
		else {
			boolean check = false;
			System.out.print("Nhap id can tim: ");
			int t = sc.nextInt();
			for (CongNhan cn : listCN)
				if (cn.id == t) {
					System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "ID", "Ho ten", "Nam sinh", "Gioi tinh",
							"Dia chi", "Bac");
					cn.output();
					check = true;
					break;
				}
			for (NhanVien nv : listNV)
				if (nv.id == t) {
					System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "ID", "Ho ten", "Nam sinh", "Gioi tinh",
							"Dia chi", "Cong viec");
					nv.output();
					check = true;
					break;
				}
			for (KySu ks : listKS)
				if (ks.id == t) {
					System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "ID", "Ho ten", "Nam sinh", "Gioi tinh",
							"Dia chi", "Nganh dao tao");
					ks.output();
					check = true;
					break;
				}
			if (!check)
				System.out.println("Khong ton tai id nay!");
		}
	}
}
