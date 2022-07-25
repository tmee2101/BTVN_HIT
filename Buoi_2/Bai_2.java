import java.util.Scanner;

public class Bai_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			if (s.compareTo("0") >= 0 && s.compareTo("9") <= 0) {
				str = str.replace(String.valueOf(str.charAt(i)), "");
				i--;
			}
		}
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		str = str.toLowerCase();
		String[] temp = str.split(" ");
		str = "";
		for (int i = 0; i < temp.length; i++) {
			str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
			if (i < temp.length - 1)
				str += " ";
		}
		System.out.println(str);
	}

}
