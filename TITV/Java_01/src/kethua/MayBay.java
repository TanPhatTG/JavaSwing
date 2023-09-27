package kethua;

public class MayBay extends PhuongTienDiChuyen {
	
	String loaiNhienLieu;

	protected MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("May bay", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}


	@Override
	public void batDau() {
		System.out.println("Cat canh");
	}


	@Override
	protected double layVanToc() {
		// TODO Auto-generated method stub
		return 500;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	protected void catCanh() {
		System.out.println("Cat canh");
	}
	
	protected void haCanh() {
		System.out.println("Ha canh !!");
	}
	
}
