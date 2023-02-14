package Chuong4;

import java.util.Scanner;

public class Customer {
	protected String Ten;
	protected String DiaChi;
	protected int sodienthangtruoc;
	protected int sodienthangnay;
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public int getSodienthangtruoc() {
		return sodienthangtruoc;
	}
	public void setSodienthangtruoc(int sodienthangtruoc) {
		this.sodienthangtruoc = sodienthangtruoc;
	}
	public int getSodienthangnay() {
		return sodienthangnay;
	}
	public void setSodienthangnay(int sodienthangnay) {
		this.sodienthangnay = sodienthangnay;
	}
	public Customer(String ten, String diaChi, int sodienthangtruoc, int sodienthangnay) {
		super();
		Ten = ten;
		DiaChi = diaChi;
		this.sodienthangtruoc = sodienthangtruoc;
		this.sodienthangnay = sodienthangnay;
	}
	public Customer() {
		super();
	}
	public void tiendien() {
		if(sodienthangnay - sodienthangtruoc >0) {
			System.out.println( "Tien dien thang nay la"+(sodienthangnay - sodienthangtruoc)*1234);
		}
		if(sodienthangnay - sodienthangtruoc <0) {
			System.out.println("Du lieu khong hop le");
		}
				
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ten khach hang"+ " ");
		Ten = sc.nextLine();
		System.out.println("Dia chi "+" ");
		DiaChi = sc.nextLine();
		System.out.println("Nhap so dien thang nay");
		sodienthangnay = sc.nextInt();
		System.out.println("Nhap so dien thang truoc");
		sodienthangtruoc = sc.nextInt();
	}
	public void hienthi() {
		System.out.println(Ten);
		System.out.println(DiaChi);
		tiendien();
	}
	
	
	
}
