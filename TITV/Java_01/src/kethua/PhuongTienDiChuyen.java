package kethua;


public abstract class PhuongTienDiChuyen {
	
	String loaiPhuongTien;
	HangSanXuat hangSanXuat;

	protected PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		super();
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	public void layTenHangSanXuat() {
		System.out.println(this.hangSanXuat.getTenHangSanXuat()); 
	}
	
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public void batDau() {
		System.out.println("Bat dau !!!");
	}
	
	public void tangToc() {
		System.out.println("Tang toc ....");
	}
	
	public void dungLai() {
		System.out.println("Dung lai. !");
	}
	
	protected abstract double layVanToc();
}
