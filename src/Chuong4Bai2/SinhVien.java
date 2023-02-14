package Chuong4Bai2;

import java.util.Scanner;

public class SinhVien {
	protected int masv;
	protected String ten;
	protected int namsinh;
	protected String email;
	protected int sodt;
	protected String khoaquanli;
	protected String khoadaotao;
	protected int lop;
	protected int diemso;
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSodt() {
		return sodt;
	}
	public void setSodt(int sodt) {
		this.sodt = sodt;
	}
	public String getKhoaquanli() {
		return khoaquanli;
	}
	public void setKhoaquanli(String khoaquanli) {
		this.khoaquanli = khoaquanli;
	}
	public String getKhoadaotao() {
		return khoadaotao;
	}
	public void setKhoadaotao(String khoadaotao) {
		this.khoadaotao = khoadaotao;
	}
	public int getLop() {
		return lop;
	}
	public void setLop(int lop) {
		this.lop = lop;
	}
	public int getDiemso() {
		return diemso;
	}
	public void setDiemso(int diemso) {
		this.diemso = diemso;
	}
	public SinhVien(int masv, String ten, int namsinh, String email, int sodt, String khoaquanli, String khoadaotao,
			int lop, int diemso) {
		super();
		this.masv = masv;
		this.ten = ten;
		this.namsinh = namsinh;
		this.email = email;
		this.sodt = sodt;
		this.khoaquanli = khoaquanli;
		this.khoadaotao = khoadaotao;
		this.lop = lop;
		this.diemso = diemso;
	}
	public SinhVien() {
		super();
	}
}
