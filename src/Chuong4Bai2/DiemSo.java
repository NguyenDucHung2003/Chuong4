package Chuong4Bai2;

import java.util.Scanner;

public class DiemSo extends SinhVien {
	protected double chuyennghanh;
	protected double tuchon;
	protected double trungbinh;
	protected String trungbinhhechu;
	public void kiemtra() {
		if(trungbinh>=8.5&& trungbinh <=10) {
			trungbinhhechu = "A";
		}
		if(trungbinh>=8.0& trungbinh <=8.4) {
			trungbinhhechu = "B+";
		}
		if(trungbinh>=7.0&& trungbinh <=7.9) {
			trungbinhhechu = "B";
		}
		if(trungbinh>=6.5&& trungbinh <=6.9) {
			trungbinhhechu = "C+";
		}
		if(trungbinh>=5.5&& trungbinh <=6.4) {
			trungbinhhechu = "C";
		}
		if(trungbinh>=5.0&& trungbinh <=5.4) {
			trungbinhhechu = "D+";
		}
		if(trungbinh>=4.0&& trungbinh <=4.9) {
			trungbinhhechu = "D";
		}
		if(trungbinh>=0&& trungbinh <=3.9) {
			trungbinhhechu = "F";
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien");
		masv = sc.nextInt();
		System.out.println("Nhap ho va ten");
		ten=sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap nam sinh");
		namsinh=sc.nextInt();
		System.out.println("Nhap email");
		email=sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap so dien thoai");
		sodt = sc.nextInt();
		System.out.println("Nhap khoa quan li");
		khoaquanli = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap khoa dao tao");
		khoadaotao = sc.nextLine();
		System.out.println("Nhap lop");
		lop=sc.nextInt();
		System.out.println("Nhap diem mon chuyen nghanh");
		chuyennghanh = sc.nextDouble();
		System.out.println("Nhap diem mon tu chon ");
		tuchon = sc.nextDouble();
		System.out.println("Nhap diem trung binh");
		trungbinh=sc.nextDouble();
	}
	public void hienthi() {
		System.out.println("Ma sinh vien "+" "+masv);
		System.out.println("ho va ten "+" "+ten);
		System.out.println("nam sinh "+" "+namsinh);
		System.out.println("email "+" "+email);
		System.out.println("so dt "+" "+sodt);
		System.out.println("khoa quan li "+" "+khoaquanli);
		System.out.println("Khoa dao tao "+" "+khoadaotao);
		System.out.println("lop "+" "+lop);
		System.out.println("Diem mon chuyen nghanh "+" "+chuyennghanh);
		System.out.println("Diem mon tu chon "+" "+tuchon);
		System.out.println("Diem mon trung binh "+" "+trungbinh);
		System.out.println("Diem mon trung binh he chu"+" ");
		kiemtra();
	}
}
