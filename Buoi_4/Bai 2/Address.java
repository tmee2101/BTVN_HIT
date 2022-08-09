import java.util.Scanner;

public class Address {
	private int id;
	private String district;
	private String province;
	
	Address(){
		
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap huyen: ");
		district = sc.nextLine();
		System.out.print("Nhap tinh: ");
		province = sc.nextLine();
	}
	
	public String getProvince() {
		return province;
	}

	public void setProvince(String a) {
		this.province = a;
	}
	
	public void output() {
		System.out.println("ID: " + id);
		System.out.println("District: " + district);
		System.out.println("Province: " + province);
	}
}
