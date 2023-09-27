package kethua;

public class XeDap extends PhuongTienDiChuyen {

	protected XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		super(loaiPhuongTien, hangSanXuat);
	}

	@Override
	protected double layVanToc() {
		
		return 30;
	}

}
