import java.awt.EventQueue;

import view.QuanLyNhanVienView;

public class RuntimeApplication extends QuanLyNhanVienView{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyNhanVienView frame = new QuanLyNhanVienView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
