package btQanLyMayTinh;

public class mayTinh {
	private hangSanXuat hangsanxuat;
	private ngaySanXuat ngaysanxuat;
	private double giaban;
	private int thoigianBH;
	public mayTinh(hangSanXuat hangsanxuat, ngaySanXuat ngaysanxuat, double giaban, int thoigianBH) {
		super();
		this.hangsanxuat = hangsanxuat;
		this.ngaysanxuat = ngaysanxuat;
		this.giaban = giaban;
		this.thoigianBH = thoigianBH;
	}
	
	public String layTenQGcuaHangSX() {
		return this.hangsanxuat.layTenQG();
	}
	
	public boolean kiemTraGiaMT(mayTinh maytinh) {	
			return this.giaban < maytinh.getGiaban();
	}
	
	
	public hangSanXuat getHangsanxuat() {
		return hangsanxuat;
	}
	public void setHangsanxuat(hangSanXuat hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}
	public ngaySanXuat getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(ngaySanXuat ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}
	public double getGiaban() {
		return giaban;
	}
	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}
	public int getThoigianBH() {
		return thoigianBH;
	}
	public void setThoigianBH(int thoigianBH) {
		this.thoigianBH = thoigianBH;
	}
	
	
}
