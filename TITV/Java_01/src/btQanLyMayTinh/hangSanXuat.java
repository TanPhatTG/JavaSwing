package btQanLyMayTinh;

public class hangSanXuat {
	private String tenHang;
	private quocGia Quocgia;
	public hangSanXuat(String tenHang, quocGia quocgia) {
		
		this.tenHang = tenHang;
		Quocgia = quocgia;
	}
	public String layTenQG() {
		return this.Quocgia.getTenQG();
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public quocGia getQuocgia() {
		return Quocgia;
	}
	public void setQuocgia(quocGia quocgia) {
		Quocgia = quocgia;
	}
		
	
}
