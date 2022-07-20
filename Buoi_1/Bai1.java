import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		int ngay, thang;
		Scanner sc = new Scanner (System.in);
		do
		{
			System.out.println("Nhap ngay sinh: ");
			ngay = sc.nextInt();
		}
		while (ngay<1 || ngay>31);
	
		do 
		{
			System.out.println("Nhap thang: ");
			thang = sc.nextInt();
		}
		while (thang<1 || thang>12);
		
		if ((ngay>=20 && thang==1) || (ngay<=18 && thang ==2)) System.out.println("Bao Binh");
		else 
			if ((ngay>=19 && thang==2) || (ngay<=20 && thang==3)) System.out.println("Song Ngu");
			else
				if ((ngay>=21 && thang==3) || (ngay<=20 && thang==4)) System.out.println("Bach Duong");
				else 
					if ((ngay>=21 && thang==4) || (ngay<=20 && thang==5)) System.out.println("Kim Nguu");
					else 
						if ((ngay>=21 && thang==5) || (ngay<=21 && thang==6)) System.out.println("Song Tu");
						else 
							if((ngay>=22 && thang==6) || (ngay<=22 && thang==7)) System.out.println("Cu Giai");
							else 
								if ((ngay>=23 && thang==7) || (ngay<=22 && thang==8)) System.out.println("Su Tu");
								else 
									if ((ngay>=23 && thang==8) || (ngay<=22 && thang==9)) System.out.println("Xu Nu");
									else 
										if ((ngay>=23 && thang==9) || (ngay<=23 && thang==10)) System.out.println("Thien Binh");
										else
											if ((ngay>=24 && thang==10)|| (ngay<=22 && thang==11)) System.out.println("Bo Cap");
											else 
												if ((ngay>=23 && thang==11) || (ngay<=21 && thang==12)) System.out.println("Nhan Ma");
												else System.out.println("Ma Ket");
		
		
	}
}
