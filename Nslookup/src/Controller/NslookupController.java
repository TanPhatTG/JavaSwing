package Controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.net.InetAddress;

import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import View.Nslookup;

public class NslookupController implements Action{
	public Nslookup nsView;

	public NslookupController(Nslookup nsView) {
		this.nsView = nsView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("Open")) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			int result = fileChooser.showOpenDialog(nsView);
			if(result == JFileChooser.APPROVE_OPTION) {
				String path = fileChooser.getSelectedFile().getAbsolutePath();
				nsView.tfDirectory.setText(path);
				
				nsView.textArea.setText(listAllFiles1(path,0)); 
			}
		}else if(command.equals("Delete")) {
		 int choose = JOptionPane.showConfirmDialog(nsView, "Are you sure to delete !");
		 if(choose==JOptionPane.YES_OPTION) {
			 String path = nsView.tfDirectory.getText();
			 DeleteFiles(path);
		 }
		 JOptionPane.showMessageDialog(nsView, "Message", "Deleted", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private void DeleteFiles(String path) {
		try {
			File file = new File(path);
			if(file.isDirectory()) {
				for (File f : file.listFiles()) {
					DeleteFiles(f.getAbsolutePath());
				}
			}
			file.delete();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	/*
	 * private String listAllFiles(String path) { File file = new File(path); String
	 * result = ""; if (!file.exists()) return result += ""; if(file.isFile())
	 * return result += "\t"+ file.getName();
	 * 
	 * for (File f : file.listFiles()) { result +=
	 * listAllFiles(f.getAbsolutePath())+"\n"; }
	 * 
	 * return result; }
	 */
	
	private String listAllFiles1(String path, int level) {
        File myFile = new File(path);
        // Kiểm tra tập tin không tôn tại
        if (!myFile.exists()) return "";
        
        // Tập tin đã tồn tại
        String result = ""; 
        // Tab vào:
        for(int i=0; i<level; i++){
            result+="\t";
        }
        
        result += ((level==0?"":"|_") + myFile.getName()+"\n");
        
        // 1. Nếu là file thì không làm gì
        if(myFile.isFile()) return result;
        // 2. Lúc này nó đã là thư mục
        // if (myFile.isDirectory()) => Kiểm tra là thư mục
        // đoạn code chính
        for(File f : myFile.listFiles()){
            result+=listAllFiles1(f.getAbsolutePath(), level+1);
        }
        return result;
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
