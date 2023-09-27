
public class NgaySinh {
	private int ngay;
	private int thang;
	private int nam;
	
	public NgaySinh(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public NgaySinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNgay() {
	
		return ngay;
	}

	public void setNgay(int ngay) {
		
		if(ngay > 0 && ngay <32) {
			this.ngay = ngay;
		}else {
			this.ngay = 1;
		}
		
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		if(thang > 0 && thang < 13) {
			this.thang = thang;
		}else {
			this.thang  =1;
		}
		
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		if(nam > 0) {
			this.nam = nam;
		}else {
			this.nam = 1;
		}
		
	}
	
	
}
