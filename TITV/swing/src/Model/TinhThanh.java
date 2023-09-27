package Model;

import java.util.ArrayList;

public class TinhThanh {
	int idTinhThanh;
	String tenTinhThanh;
	
	
	
	public TinhThanh(int idTinhThanh, String tenTinhThanh) {
		super();
		this.idTinhThanh = idTinhThanh;
		this.tenTinhThanh = tenTinhThanh;
	}

	public TinhThanh() {
		this.idTinhThanh=0;
		this.tenTinhThanh="";
	}
	
	public static ArrayList<TinhThanh> getListProvice(){
		
		int[] id_Provice  = {0,296,254,291,209,204,222,275,274,256,271,252,290,206,292,
							236,262,261,215,251,277,269,219,226,24,239,220,225,218,28,
							293,221,258,297,260,213,214,205,263,272,228,238,229,259,
							210,257,232,235,255,203,233,299,212,276,227,208,237,234,
							273,294,207,270,211,216};
		
		String[] name_Provice = {"","An Giang","Bà Rịa – Vũng Tàu","Bạc Liêu",	"Bắc Kạn","Bắc Giang",
				"Bắc Ninh",	"Bến Tre","Bình Dương",	"Bình Định","Bình Phước","Bình Thuận","Cà Mau",
				"Cao Bằng",	"Cần Thơ","Đà Nẵng","Đắk Lắk","Đắk Nông","Điện Biên","Đồng Nai",
				"Đồng Tháp","Gia Lai","Hà Giang","Hà Nam","Hà Nội","Hà Tĩnh","Hải Dương","Hải Phòng",
				"Hòa Bình",	"Hồ Chí Minh","Hậu Giang","Hưng Yên","Khánh Hòa","Kiên Giang","Kon Tum",		
				"Lai Châu",	"Lào Cai","Lạng Sơn","Lâm Đồng","Long An","Nam Định","Nghệ An","Ninh Bình",
				"Ninh Thuận","Phú Thọ","Phú Yên","Quảng Bình","Quảng Nam","Quảng Ngãi","Quảng Ninh",
				"Quảng Trị","Sóc Trăng","Sơn La","Tây Ninh","Thái Bình","Thái Nguyên","Thanh Hóa",
				"Thừa Thiên - Huế","Tiền Giang","Trà Vinh",	"Tuyên Quang","Vĩnh Long","Vĩnh Phúc",
				"Yên Bái"
				};
		int i = 0 ;
		ArrayList<TinhThanh> listProvice = new ArrayList<TinhThanh>();
		for(int ts : id_Provice) {
			TinhThanh provice = new TinhThanh(ts, name_Provice[i]);
			listProvice.add(provice);
			i++;
		}
		return listProvice;

	}
	
	public static TinhThanh getTinhByIndex(int selectedIndex) {
		TinhThanh tinh = getListProvice().get(selectedIndex);
		return tinh;
	}
		
	public static TinhThanh getTinhByName(String name){
		TinhThanh tinh  = new TinhThanh();
		ArrayList<TinhThanh> listProvice = getListProvice();
		for (TinhThanh tinhThanh : listProvice) {
			if(tinhThanh.getTenTinhThanh().equals(name)) {
				return tinhThanh;
			}
		}
		return null;
	}
	
	public int getIdTinhThanh() {
		return idTinhThanh;
	}
	public void setIdTinhThanh(int idTinhThanh) {
		this.idTinhThanh = idTinhThanh;
	}
	public String getTenTinhThanh() {
		return tenTinhThanh;
	}
	public void setTenTinhThanh(String tenTinhThanh) {
		this.tenTinhThanh = tenTinhThanh;
	}

	
}
