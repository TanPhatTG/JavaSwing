import java.util.List;
import java.util.Scanner;


public class test {
	public static void main(String[] args) {
		SinhVienList svList = new SinhVienList();
		Scanner sc = new Scanner(System.in);
		int option=0;
		do {
			System.out.println("=========================================================");
			System.out.println("(0) In danh sach sinh vien\n"
					+ "(1) Them sinh vien vao danh sach\n"
					+ "(2) Kiem tra danh sach co rong khong\n"
					+ "(3) Lay ra so luong sinh vien trong danh sach\n"
					+ "(4) Clear danh sach\n"
					+ "(5) Tim sinh vien theo ID\n"
					+ "(6) Xoa sinh vien theo ID\n"
					+ "(7) Tim sinh vien theo ten");
			System.out.println("=========================================================");
			System.out.println("Nhap lua chon: ");
			option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 0: {
				svList.printList();
				break;
			}
			case 1: {
				svList.addSV();
				break;
			}
			case 2: {
				svList.checkEmpty(option);
				break;
			}
			case 3: {
				svList.checkEmpty(option);
				break;
			}
			case 4: {
				svList.ClearList(option);
				break;
			}
			case 5: {
				svList.checkId(option);
				break;
			}
			case 6: {
				svList.ClearList(option);
				break;
			}
			case 7: {
				svList.checkId(option);
				break;
			}
			case 8: {
				svList.xuatDStheoDiemtuThapCao();
				return;
			}
			case 9: {
				System.out.println("Program has been stopped");
				return;
			}
			default:
				System.out.println("Again !!\n");
				
			}
		}while(option >=0 && option <= 8);
	}
}
