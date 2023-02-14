package Chuong4;

public class NewCustomer extends Customer {
	public void newtiendien() {
		int sodien = sodienthangnay - sodienthangtruoc;
		if(Ten.contains("doanh nghiep")) {
			if(sodien<=100) {
				System.out.println("Tien dien thang nay la "+sodien*2000);
			}
			if(sodien>100) {
				System.out.println("Tien dien thang nay la"+sodien*2500);			}
		}
		if(!Ten.contains("doanh nghiep")){
		if(sodien <=100) {
			System.out.println("Tien dien thang nay la" +sodien*1234 );
		}
		if(sodien>100) {
			System.out.println("Tien dien thang nay la"+sodien*1650);
		}
		}
	}
	public void newhienthi() {
		System.out.println(Ten);
		System.out.println(DiaChi);
		newtiendien();
	}
}
