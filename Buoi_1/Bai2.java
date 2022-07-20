import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b, c;
		System.out.println("Nhap 3 canh tam giac: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a+b<=c || a+c<=b || b+c<=a) System.out.println(a+", " +b+ ", " +c+ " khong la 3 canh cua tam giac");
		else
			if (a==b && b==c) System.out.println("Day la tam giac deu");
			else 
				if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
					if (a==b || b==c || a==c) System.out.println("Day la tam giac vuong can");
					else System.out.println("Day la tam giac vuong");}
				else if (a==b || b==c || a==c) System.out.println("Day la tam giac can");
					else System.out.println("Day la tam giac thuong"); 	
	}
}
