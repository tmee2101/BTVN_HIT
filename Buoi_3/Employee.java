import java.util.Scanner;

public class Employee {
	private String id;
	private String name;
	private int age;
	private int workingDays;
	private double salary;
	final int PRICE = 50;
	static Scanner sc = new Scanner(System.in);
	public Employee() {
	}
	
	public Employee(String id, String name, int age, int workingDays) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.workingDays = workingDays;
	}
	
	public void input() {
		System.out.print("Nhap ma nhan vien: ");
		id = sc.nextLine();
		System.out.print("Nhap ho va ten: ");
		name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		age = sc.nextInt();
		System.out.print("Nhap so ngay cong: ");
		workingDays = sc.nextInt();
		sc.nextLine();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	
	public double getSalary() {
		salary = workingDays * PRICE;
		return salary;
	}
	public void output() {
		System.out.println("Id: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Woring day: "+ workingDays);
		System.out.println("Salary: "+ getSalary());
	}
	public static void main(String[] args) {
		Employee a = new Employee();
		a.input();
		
		Employee b = new Employee("123", "B", 20, 25);
		b.output();
		
		Employee c = new Employee();
		System.out.print("Nhap ma nhan vien: ");
		c.setId(sc.nextLine());
		System.out.print("Nhap ho va ten: ");
		c.setName(sc.nextLine());
		System.out.print("Nhap tuoi: ");
		c.setAge(sc.nextInt());
		System.out.print("Nhap so ngay cong: ");
		c.setWorkingDays(sc.nextInt());
		c.output();		
	}
}
