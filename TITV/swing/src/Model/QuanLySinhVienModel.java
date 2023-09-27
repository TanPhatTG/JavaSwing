package Model;

import java.util.ArrayList;

public class QuanLySinhVienModel {

	ArrayList<NhanVien> nhanVienList ;
	
	
	
	public QuanLySinhVienModel() {
		this.nhanVienList = new ArrayList<NhanVien>();
	}

	public void Insert(NhanVien nv) {
		nhanVienList.add(nv);
	}
	
	public void Update(NhanVien nv) {
		for (NhanVien nhanVien : nhanVienList) {
			if(nhanVien.getIdNhanVien() == nv.getIdNhanVien()) {
				nhanVien.setHoTenNV(nv.getHoTenNV());
				nhanVien.setNgaySinh(nv.getNgaySinh());
				nhanVien.setQueQuan(nv.getQueQuan());
				nhanVien.setGioiTinh(nv.isGioiTinh());
				nhanVien.setChiTieu1(nv.getChiTieu1());
				nhanVien.setChiTieu2(nv.chiTieu2);
				nhanVien.setChiTieu3(nv.chiTieu3);
			}
		}
	}
	
	public void Remove(NhanVien nv) {
		nhanVienList.remove(nv);
	}

	public ArrayList<NhanVien> getNhanVienList() {
		return nhanVienList;
	}

	public void setNhanVienList(ArrayList<NhanVien> nhanVienList) {
		this.nhanVienList = nhanVienList;
	}
	
	
}
