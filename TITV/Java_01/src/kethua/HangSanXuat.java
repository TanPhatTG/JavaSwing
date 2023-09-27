package kethua;

public class HangSanXuat {
	String tenHangSanXuat;
	String tenQuocGia;
	protected HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
		super();
		this.tenHangSanXuat = tenHangSanXuat;
		this.tenQuocGia = tenQuocGia;
	}
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}
	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	public String getTenQuocGia() {
		return tenQuocGia;
	}
	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
	
}
