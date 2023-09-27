package kethua;

public class test {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("Boeing", "USA");
		HangSanXuat hsx2 = new HangSanXuat("Mecedes", "Germany");
		HangSanXuat hsx3 = new HangSanXuat("Martin", "VN");
		
		PhuongTienDiChuyen p1 = new MayBay(hsx1, "Diesen");
		
		p1.layTenHangSanXuat();
		System.out.println(p1.layVanToc());
		
		p1.batDau();
	}
}
