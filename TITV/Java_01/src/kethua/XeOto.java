package kethua;

public class XeOto extends PhuongTienDiChuyen {

	String loaiNhienLieu;
	
	protected XeOto(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	protected double layVanToc() {
		// TODO Auto-generated method stub
		return 200;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

}
