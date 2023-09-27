package Model;

public class NhanVien {
	int idNhanVien;
	String hoTenNV;
	TinhThanh queQuan;
	String ngaySinh;
	boolean gioiTinh;
	float chiTieu1;
	float chiTieu2;
	float chiTieu3;
	
	public NhanVien(int idNhanVien, String hoTenNV, TinhThanh queQuan, String ngaySinh, boolean gioiTinh,
			float chiTieu1, float chiTieu2, float chiTieu3) {
		super();
		this.idNhanVien = idNhanVien;
		this.hoTenNV = hoTenNV;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.chiTieu1 = chiTieu1;
		this.chiTieu2 = chiTieu2;
		this.chiTieu3 = chiTieu3;
	}
	
	public NhanVien() {
		super();
		this.idNhanVien = 0;
		this.hoTenNV = "";
		this.queQuan = null;
		this.ngaySinh = "";
		this.gioiTinh = false;
		this.chiTieu1 = 0;
		this.chiTieu2 = 0;
		this.chiTieu3 = 0;
	}
	
	

	public int getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

	public String getHoTenNV() {
		return hoTenNV;
	}

	public void setHoTenNV(String hoTenNV) {
		this.hoTenNV = hoTenNV;
	}

	public TinhThanh getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(TinhThanh queQuan) {
		this.queQuan = queQuan;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public float getChiTieu1() {
		return chiTieu1;
	}

	public void setChiTieu1(float chiTieu1) {
		this.chiTieu1 = chiTieu1;
	}

	public float getChiTieu2() {
		return chiTieu2;
	}

	public void setChiTieu2(float chiTieu2) {
		this.chiTieu2 = chiTieu2;
	}

	public float getChiTieu3() {
		return chiTieu3;
	}

	public void setChiTieu3(float chiTieu3) {
		this.chiTieu3 = chiTieu3;
	}

	
	
	
	
}

