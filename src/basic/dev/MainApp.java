package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Tổng các số từ 1 đến 100
		
//		int i = 0, sum = 0;
//		while(i <=100) {
//			i++;
//			sum+=i;
//		}
//		System.out.println("Tong 100 so dau tien la "+ sum);
//		
		// Nhập vào số tự nhiên n. Tính tổng các số chia hết cho 3
//		int tong = 0, j = 0;
//		
//		System.out.println("Nhap n: ");
//		int n = sc.nextInt();
//		while(j < n) {
//			if (j % 3 == 0) {
//				tong += j;
//			}	
//			j++;
//		}
//		System.out.println("Tong cac so chia het cho 3 nho hon n la: " + tong);
		
		// In ra 100 so fibonaci dau tien
//		int dem = 0;
//		long a = 1;
//		long b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		while(true) {
//			long c = a + b;
//			System.out.println(c);
//			dem++;
//			a = b;
//			b = c;
//		if (dem == 98) {
//			break;
//		}
//		}
		
//		// Liệt kê các số từ 100 đến 999 có tổng các chữ số chia hết cho 3
//		int i = 100;
//		int tong_so = 0;
//		
//		while(i <= 999) {
//			int so_tach;
//			int j = i;
//			int c = j % 10;
//			int b = (j/10)%10;
//			int a = (j/100);
//			tong_so = a + b + c;
//			if (tong_so % 3 == 0) {
//				System.out.println(i);
//			}
//		
//		i++;
//				
//			
//		}
		
		// Kiem tra xem 1 so co phai la so polinome khong
		System.out.println("Nhap vao 1 so nguyen: ");
		int n = sc.nextInt();
		int temp = n;
		int rv = 0;
		while (n > 0) {
			int mod = n % 10;
			n /= 10;
			rv = rv*10 + mod;
		}
		if (rv == temp) {
			System.out.println("Day la so polinome");
		} else {
			System.out.println("Day khong phai la so polinome");
		}

		
		
	}
}
