package btQanLyMayTinh;

public class test {
	public static void main(String[] agr) {
		ngaySanXuat ngaysx1 = new ngaySanXuat(12, 04, 2001);
		ngaySanXuat ngaysx2 = new ngaySanXuat(24, 12, 2005);
		ngaySanXuat ngaysx3 = new ngaySanXuat(05, 07, 2007);
		
		quocGia quocgia1 = new quocGia("USA", "My");
		quocGia quocgia2 = new quocGia("TQ", "Trung Quoc");
		quocGia quocgia3 = new quocGia("TWA", "Dai Loan");
		
		hangSanXuat hangsx1 = new hangSanXuat("Apple", quocgia1);
		hangSanXuat hangsx2 = new hangSanXuat("Lenovo", quocgia2);
		hangSanXuat hangsx3 = new hangSanXuat("Asus", quocgia3);
		
		mayTinh maytinh1 = new mayTinh(hangsx1, ngaysx1, 2000, 2);
		mayTinh maytinh2 = new mayTinh(hangsx2, ngaysx2, 1200, 1);
		mayTinh maytinh3 = new mayTinh(hangsx3, ngaysx3, 1000, 1);
		
		
		System.err.println(""+maytinh1.kiemTraGiaMT(maytinh3)); 
		System.err.println(maytinh1.layTenQGcuaHangSX());
	}
}
