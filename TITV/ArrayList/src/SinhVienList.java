import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SinhVienList {
	Scanner sc = new Scanner(System.in);
	String idDS;
	SinhVien sv;
	
	List<SinhVien> svList = new ArrayList<SinhVien>();
	
	public void addSV() {
		SinhVien sv = new SinhVien();
		
		System.out.println("Nhap id sinh vien: ");
		String id = sc.nextLine();
		
		sv.setId(id);
		
		System.out.println("Nhap ten sinh vien: ");
		String ten = sc.nextLine();
	
		sv.setName(ten);
		
		System.out.println("Nhap nam sinh cua sinh vien: ");
		int namSinh = Integer.parseInt(sc.nextLine());
	
		sv.setYearOfBirth(namSinh);
		
		System.out.println("Nhap diem trung binh sinh vien: ");
		double diemtb = Double.parseDouble(sc.nextLine());
	
		sv.setAvgPoint(diemtb);
		
		this.svList.add(sv);
		
		System.err.println("Done.");
		
	}
	
	public void printList() {
		
		for (SinhVien sv : svList) {
			System.out.println(sv);
		}
		System.out.println("\n");
	}
	
	public void checkEmpty(int option) {
		int size = this.svList.size();
		if(option == 2) {
			if(size <= 0) {
				System.out.println("Danh sach Sinh vien dang rong\n");
			}else {
				System.out.println("Danh sach sinh vien co phan tu\n");
			}
		}else {
			System.out.println("So luong sinh vien trong danh sach la :  "+this.svList.size()+ "\n");
		}
		
	}
	
	public void ClearList(int option) {
		if(option == 4) {
			int sure;
			System.err.println("Ban co chac muon lear toan bo danh sach sinh vien");
			System.err.println("Yes(1) or No (0)");
			sure = Integer.parseInt(sc.nextLine());
			if(sure == 1) {
				this.svList.clear();
			}
			return;
		}else {
			System.out.println("Nhap id sinh vien ban muon xoa: ");
			String id = sc.nextLine();
			for (SinhVien sv : svList) {
				if(sv.getId().equals(id.trim())) {
					System.err.println("Ban co chac muon xoa sinh vien id= "+sv.getId()+" ra khoi danh sach ?");
					System.err.println("Yes(1)  or  No(0) ");
					int choose = Integer.parseInt(sc.nextLine());
					if(choose == 1){
						this.svList.remove(sv);
					}else {
						System.out.println("Huy xoa\n");
						return;
					}

				}
			}
		}
	}
	
	public boolean checkId(int option) {
		if(option == 5) {
			int check = 0;
			System.out.println("Nhap ma sinh vien can tim: ");
			String id = sc.nextLine();
			for (SinhVien sv : svList) {
				if(sv.getId().equals(id.trim())) {
					System.out.println(sv);
					check++;
				}	
			}
			if(check > 0) {
				return true;
			}else {
				System.out.println("Khong co sinh vien id: "+id+" ban muon tim kiem\n");
				return false;
			}
			
			
		}else {
			int check = 0;
			System.out.println("Nhap ten sinh vien can tim: ");
			String ten = sc.nextLine(); 
			for (SinhVien sv : svList) {
				if(sv.getName().equals(ten.trim())) {
					System.out.println(sv);
					check++;
				}
			}
			if(check > 0) {
				return true;
			}else {
				System.out.println("Khong co sinh vien ten "+ten+" ban muon tim\n");
				return false;
			}
			
		}
	}
	
	public void xuatDStheoDiemtuThapCao() {
		Collections.sort(this.svList, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if(o1.getAvgPoint() > o2.getAvgPoint()) {
					return 1;
				}
				else if(o1.getAvgPoint() < o2.getAvgPoint()) {
					return -1;
				}
				return 0;
			}
			
		});
		for (SinhVien sv : svList) {
			System.out.println(sv.toString());
		}
	}
	
	public String getIdDS() {
		return idDS;
	}
	public void setIdDS(String idDS) {
		this.idDS = idDS;
	}
	public SinhVien getSv() {
		return sv;
	}
	public void setSv(SinhVien sv) {
		this.sv = sv;
	}

	public List<SinhVien> getSvList() {
		return svList;
	}

	public void setSvList(List<SinhVien> svList) {
		this.svList = svList;
	}
	
	
}
