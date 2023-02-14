package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("So khach hang");
	int n;
	n = sc.nextInt();
	ArrayList<NewCustomer>kh = new ArrayList<>();
	for(int i=0;i<n;i++) {
	NewCustomer khachhang = new NewCustomer();	
	khachhang.nhap();
	kh.add(khachhang);
	}
	for(int i=0;i<n;i++) {
		kh.get(i).newhienthi();
	}
}
}
