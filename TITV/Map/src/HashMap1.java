import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMap1 {
	
	 SortedMap<String, String> tudien = new TreeMap<>();
	 Scanner sc = new Scanner(System.in);
	public String main() {
		
		System.out.println("Nhap vao: ");
		sc.nextLine();
		
		return this.tudien.get(sc);
	}
}
