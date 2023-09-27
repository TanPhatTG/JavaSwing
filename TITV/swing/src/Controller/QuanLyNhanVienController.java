package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Model.NhanVien;
import Model.QuanLySinhVienModel;
import Model.TinhThanh;
import view.QuanLyNhanVienView;

public class QuanLyNhanVienController implements Action{
	
	public QuanLyNhanVienView view;
	public QuanLySinhVienModel model;
	

	public QuanLyNhanVienController(QuanLyNhanVienView view) {
		
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		
		if(command.equals("Add")) {

			int ID = 0;
			if(view.tfID.getText().trim().length() > 0) {
				ID = Integer.valueOf(view.tfID.getText());
			}			
			String name = view.tdName.getText();
			String date = view.tfDate.getText();
			
			TinhThanh provice = TinhThanh.getTinhByIndex(view.cbxProvice.getSelectedIndex());
			float CT1 =-1;
			if(view.tfCT1.getText().trim().length() > 0) {
				CT1 = Float.valueOf(view.tfCT1.getText());
			}
			float CT2=-1 ;
			if(view.tdCT2.getText().trim().length() > 0) {
				CT2 = Float.valueOf(view.tdCT2.getText()) ;
			}
			float CT3 =-1;
			if(view.tfCT3.getText().trim().length() > 0) {
				CT3 = Integer.valueOf(view.tfCT3.getText());
			}
			boolean sex = ((view.rdbtnFemale.isSelected()?true:false)); //Hàm lấy giá trị của RadioButton
					
			NhanVien nv = new NhanVien(ID,name,provice,date,sex,CT1,CT2,CT3);
			if(!checkInput(nv)) {
				return;
			}
			this.AddEmployee(nv);
			
		}else if(command.equals("Update")) {
			try {
				view.btnDontSave.setEnabled(true);
				view.btnSave.setEnabled(true);
				this.ShowInfo();
				view.tfID.setEnabled(false);
			} catch (Exception e2) {
				view.lblError.setText("Vui lòng chọn nhân viên cần chỉnh sửa");
			}

		}
		else if(command.equals("Don't Save")) {
			view.tfID.setEnabled(true);
			view.btnSave.setEnabled(false);
			view.btnDontSave.setEnabled(false);
		}else if(command.equals("Save")) {
			this.Update();
			view.btnDontSave.setEnabled(false);
			view.btnSave.setEnabled(false);
		}else if(command.equals("Delete")){
			
			this.ShowInfo();
			int option = JOptionPane.showConfirmDialog(view, "Bạn có chắc chắn muốn xóa nhân viên này !");
			if(option == JOptionPane.YES_OPTION) {
				DefaultTableModel table = (DefaultTableModel) view.table.getModel();
				int index = view.table.getSelectedRow();
				table.removeRow(index);
		
				int idSelected = Integer.valueOf(table.getValueAt(index, 0)+"");
				for (NhanVien nv : model.getNhanVienList()) {
					if(nv.getIdNhanVien() == idSelected) {
						model.Remove(nv);
					}
				}
				
			}
			
		}else if(command.equals("Search")) {
			this.ClearForm();
			this.Search();
		}
	}

	private void Search() {
		TinhThanh tinh = TinhThanh.getTinhByIndex(view.cbxSelectProvice.getSelectedIndex());
		String IDsearch = view.tfIDSearch.getText();
		
		DefaultTableModel table = (DefaultTableModel) view.table.getModel();
		int countRow = table.getRowCount();
		Set<Integer> vitriCanXoa = new TreeSet<Integer>();
		
		if(tinh != null) {
			for (int i = 0; i < countRow; i++) {
				String idInTable = table.getValueAt(i, 0)+"";
				if(idInTable.indexOf(IDsearch) <0) {
					vitriCanXoa.add(i);
				}
			}
		}
		
		if(IDsearch.trim().length() > 0) {
			for (int i = 0; i < countRow; i++) {
				String tenTinh = table.getValueAt(i, 4)+"";
				String idInTable = table.getValueAt(i, 0)+"";
				if(tenTinh.equals(tinh.getTenTinhThanh())) {
					vitriCanXoa.add(i);
				}
			}
		}
	}


	private void ShowInfo() {
	//////////   HÀM LẤY GIÁ TRỊ TỪ TABLE   /////////
		DefaultTableModel table = (DefaultTableModel) view.table.getModel();
		int index = view.table.getSelectedRow();
		String ID = table.getValueAt(index, 0)+"";
		String name = table.getValueAt(index, 1)+"";
		String date = table.getValueAt(index, 2)+"";
		String sex = table.getValueAt(index, 3)+"";
		TinhThanh provice = TinhThanh.getTinhByName(table.getValueAt(index, 4)+"");
		String CT1 = table.getValueAt(index, 5)+"";
		String CT2 = table.getValueAt(index, 6)+"";
		String CT3 = table.getValueAt(index, 7)+"";
		
		
	/////////////// SET CÁC GIÁ TRỊ VÀO CÁC TEXTFIELD  ///////////	
		view.tfID.setText(ID);
		view.tdName.setText(name);
		view.tfDate.setText(date);
		view.cbxProvice.setSelectedItem(provice);
		if(sex.equals("Nữ")) {
			view.rdbtnMale.setSelected(true);
		}else {
			view.rdbtnFemale.setSelected(true);
		}
		view.tfCT1.setText(CT1);
		view.tdCT2.setText(CT2);
		view.tfCT3.setText(CT3);
	}


	private void Update() {
		DefaultTableModel table = (DefaultTableModel) view.table.getModel();
		int count = table.getRowCount();
		
		String ID = view.tfID.getText();				
		String name = view.tdName.getText();
		String date = view.tfDate.getText();
		TinhThanh provice = TinhThanh.getTinhByIndex(view.cbxProvice.getSelectedIndex());

		String	CT1 = view.tfCT1.getText();
		String	CT2 = (view.tdCT2.getText()) ;
		String	CT3 = (view.tfCT3.getText());
		String sex = ((view.rdbtnFemale.isSelected()==true?"Nữ":"Nam"));
		
		for (int i = 0; i < count; i++) {
			String id = table.getValueAt(i,0)+"";
			if(ID.equals(id)) {
				table.setValueAt(name,i,1);
				table.setValueAt(date, i, 2);
				System.out.println("sakdlkd "+view.rdbtnFemale.isSelected());
				table.setValueAt(sex, i, 3);
				table.setValueAt(provice.getTenTinhThanh(), i, 4);
				table.setValueAt(CT1, i, 5);
				table.setValueAt(CT2, i, 6);
				table.setValueAt(CT3, i, 7);
			}
		}
		view.tfID.setEnabled(true);
		
		
		NhanVien nv = new NhanVien (Integer.valueOf(ID),name, provice, date, (sex.equals("Nữ")?true:false),Float.valueOf(CT1),Float.valueOf(CT2),Float.valueOf(CT3));
		model.Update(nv);
	}


	private boolean checkInput(NhanVien nv) {
		//System.out.println("Chekc; "+view.btnGroup.isSelected());
		if(nv.getIdNhanVien() <= 0) {
			view.lblError.setText("Vui lòng nhập ID"); return false;
		}else if(nv.getHoTenNV().trim().length() <= 0) {
			view.lblError.setText("Vui lòng nhập họ tên nhân viên"); return false;
		}else if(nv.getNgaySinh().trim().length() <= 0) {
			view.lblError.setText("Vui lòng nhập Ngày sinh"); return false;
		}else if(!view.rdbtnFemale.isSelected() && !view.rdbtnMale.isSelected()) {
			view.lblError.setText("Vui lòng nhập giới tính"); return false;
		}else if(view.cbxProvice.getSelectedIndex() == 0) {
			view.lblError.setText("Vui lòng nhập quê quán"); return false;
		}else if(nv.getChiTieu1() <0) {
			view.lblError.setText("Vui lòng nhập chỉ tiêu 1"); return false;
		}
		else if(nv.getChiTieu2() <0) {
			view.lblError.setText("Vui lòng nhập chỉ tiêu 2"); return false;
		}
		else if(nv.getChiTieu3() <0) {
			view.lblError.setText("Vui lòng nhập chỉ tiêu 3"); return false;
		}
		return true;
	}
	
	private void AddEmployee(NhanVien nv1) {
 		
		ArrayList<NhanVien> nvList = new ArrayList<NhanVien>();
		nvList.add(nv1);
		model = new QuanLySinhVienModel();
		model.setNhanVienList(nvList);
		
		DefaultTableModel table = (DefaultTableModel) view.table.getModel();
		table.addRow(new Object[] {
				nv1.getIdNhanVien()+"",nv1.getHoTenNV(), nv1.getNgaySinh(),(nv1.isGioiTinh()==true?"Nữ":"Nam"),
				nv1.getQueQuan().getTenTinhThanh(),nv1.getChiTieu1()+"",nv1.getChiTieu2()+"",nv1.getChiTieu3()+""});
		
		view.tfID.setText("");
		view.tdName.setText("");
		view.tfDate.setText("");
		view.cbxProvice.setSelectedItem(-1);
		view.btnGroup.clearSelection();
		
		view.tfCT1.setText("");
		view.tdCT2.setText("");
		view.tfCT3.setText("");
		
	}
	

	private void ClearForm() {
		DefaultTableModel table = (DefaultTableModel) view.table.getModel();
		int rowCount  = table.getRowCount();
		while (true) {
			if(rowCount > 0) {
				table.removeRow(0);
			}else {
				break;
			}
		}
		List<NhanVien> nvList = model.getNhanVienList();
		for (NhanVien nhanVien : nvList) {
			this.AddInScreen(nhanVien);
		}
		
	}

	private void AddInScreen(NhanVien nhanVien) {
		DefaultTableModel table = (DefaultTableModel) view.table.getModel();
		table.addRow(new Object[] {nhanVien.getIdNhanVien(),
									nhanVien.getHoTenNV(),
									nhanVien.getNgaySinh(),
									(nhanVien.isGioiTinh()==true?"Nữ":"Nam"),
									nhanVien.getQueQuan().getTenTinhThanh(),
									nhanVien.getChiTieu1(),
									nhanVien.getChiTieu2(), nhanVien.getChiTieu3()});
	}


	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	
}
