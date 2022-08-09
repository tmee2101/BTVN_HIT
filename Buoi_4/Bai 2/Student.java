import java.util.Scanner;

public class Student {
	private String id;
	private String name;
	private int age;
	Address diaChi;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id: ");
		id = sc.nextLine();
		System.out.println("Nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = sc.nextInt();
		diaChi = new Address();
		diaChi.input();
	}
	
	public String getId() {
		return id;
	}

	public void output() {
		System.out.println("Student's id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		diaChi.output();
	}
}
