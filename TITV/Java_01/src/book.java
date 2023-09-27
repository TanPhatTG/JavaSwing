
public class book {
	private String tenSach;
	private int giaBan;
	private int namXuatBan;
	private String tacGia;
	
	public book(String tenSach, int giaBan, int namXuatBan, String tacGia) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}

	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void inTenSach() {
		System.err.println("Ten sach la: "+this.tenSach);
	}
	
	public boolean checkTrungNamXuatBan(book booK) {
		return this.namXuatBan == booK.namXuatBan;
	}
	
	public double giaSauGiam( double x) {
		return this.giaBan*(1-x/100);
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		if(giaBan >= 0) {
			this.giaBan = giaBan;
		}else {
			this.giaBan = 0;
		}
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		if(namXuatBan > 0) {
			this.namXuatBan = namXuatBan;
		}else {
			this.namXuatBan =1;
		}
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	
	
	
}
