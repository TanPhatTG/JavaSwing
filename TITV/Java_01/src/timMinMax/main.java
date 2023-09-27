package timMinMax;

import java.util.Scanner;

public class main {
	public static void main(String[] agr) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("nhap so luong phan tu: ");
		do {
			n = sc.nextInt();
			
		} while (n < 0);
		
		int a[] = new int[n];
				
		for(int i =0; i < n; i++) {
			System.out.println("a["+i+"]: ");
			a[i]= sc.nextInt();
		}
	
		//int index = n/2;
		
		for (int i = 0; i < n/2; i++) {
			int temp = a[i];
			a[i] = a[n- i -1];
			a[n- i -1] = temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Mang: " + a[i]);
		}
		
    }

}