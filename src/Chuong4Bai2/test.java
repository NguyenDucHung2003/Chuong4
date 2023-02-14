package Chuong4Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien");
		int n;
		n= sc.nextInt();
		ArrayList<DiemSo>sv = new ArrayList<>();
		for(int i=0;i<n;i++) {
			DiemSo diemso = new DiemSo();
			diemso.nhap();
			sv.add(diemso);
		}
		for(int i=0;i<n;i++) {
			sv.get(i).hienthi();
		}
	}
}
