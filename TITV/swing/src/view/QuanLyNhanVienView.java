package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import Controller.QuanLyNhanVienController;
import Model.TinhThanh;

import javax.swing.JPasswordField;
import java.awt.Component;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class QuanLyNhanVienView extends JFrame {

	public JPanel contentPane;
	public JTable table;
	public TextField tfDate;
	public TextField tdName;
	public TextField tfID;
	public TextField tfCT3;
	public TextField tdCT2;
	public TextField tfCT1;
	public JComboBox cbxProvice;
	public ButtonGroup btnGroup;
	public JLabel lblError;
	public JRadioButton rdbtnMale;
	public JRadioButton rdbtnFemale;
	public JButton btnSave;
	public JButton btnDontSave;
	public JComboBox cbxSelectProvice;
	public TextField tfIDSearch;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public QuanLyNhanVienView() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 680);
		
		Action action = new QuanLyNhanVienController(this);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		
		
		JMenu mnFile = new JMenu("File");
		mnFile.setBackground(new Color(255, 255, 255));
		mnFile.setFont(new Font("Arial", Font.PLAIN, 12));
		
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.setFont(new Font("Arial", Font.PLAIN, 12));
		mnFile.add(mntmNew);
				
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.setFont(new Font("Arial", Font.PLAIN, 12));
		mnFile.add(mntmOpen);
				
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setFont(new Font("Arial", Font.PLAIN, 12));
		
		mnFile.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setFont(new Font("Arial", Font.PLAIN, 12));
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setFont(new Font("Arial", Font.PLAIN, 12));
		mnHelp.add(mntmAbout);
		
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTinhthanhSearch = new JLabel("Tỉnh thành");
		lblTinhthanhSearch.setFont(new Font("Arial", Font.BOLD, 15));
		lblTinhthanhSearch.setBounds(43, 10, 80, 34);
		contentPane.add(lblTinhthanhSearch);
		
		cbxSelectProvice = new JComboBox();
		ArrayList<TinhThanh> listTinhThanh = TinhThanh.getListProvice();
		for (TinhThanh tinhThanh : listTinhThanh) {
			cbxSelectProvice.addItem(tinhThanh.getTenTinhThanh());;
		}
		cbxSelectProvice.setBounds(131, 17, 178, 22);
		
		contentPane.add(cbxSelectProvice);
		
		JLabel lblIDNVSearch = new JLabel("ID Nhân viên:");
		lblIDNVSearch.setFont(new Font("Arial", Font.BOLD, 15));
		lblIDNVSearch.setBounds(329, 10, 98, 34);
		contentPane.add(lblIDNVSearch);
		
		tfIDSearch = new TextField();
		tfIDSearch.setForeground(new Color(0, 0, 0));
		tfIDSearch.setFont(new Font("Cambria", Font.PLAIN, 15));
		tfIDSearch.setBounds(443, 22, 191, 22);
		contentPane.add(tfIDSearch);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Arial", Font.BOLD, 15));
		btnSearch.setBounds(642, 23, 90, 21);
		contentPane.add(btnSearch);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Arial", Font.BOLD, 15));
		btnClear.setBounds(742, 23, 85, 21);
		contentPane.add(btnClear);
		
		JLabel lblListEmployee = new JLabel("List Employee");
		lblListEmployee.setFont(new Font("Arial", Font.BOLD, 17));
		lblListEmployee.setBounds(43, 65, 118, 34);
		contentPane.add(lblListEmployee);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.ITALIC, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Họ tên", "Ngày sinh", "Giới tính", "Quê quán", "Chỉ tiêu 1", "Chỉ tiêu 2", "Chỉ tiêu 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(53, 113, 774, 256);
		contentPane.add(scrollPane);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(25, 390, 830, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(159, 85, 684, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(43, 436, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblHTn = new JLabel("Họ tên:");
		lblHTn.setFont(new Font("Arial", Font.BOLD, 15));
		lblHTn.setBounds(43, 475, 67, 13);
		contentPane.add(lblHTn);
		
		JLabel lblNgySinh = new JLabel("Ngày sinh:");
		lblNgySinh.setFont(new Font("Arial", Font.BOLD, 15));
		lblNgySinh.setBounds(43, 512, 80, 22);
		contentPane.add(lblNgySinh);
		
		JLabel lblQuQun = new JLabel("Quê quán:");
		lblQuQun.setFont(new Font("Arial", Font.BOLD, 15));
		lblQuQun.setBounds(43, 559, 80, 13);
		contentPane.add(lblQuQun);
		
		JLabel lblGiiTnh = new JLabel("Giới tính:");
		lblGiiTnh.setFont(new Font("Arial", Font.BOLD, 15));
		lblGiiTnh.setBounds(397, 439, 84, 13);
		contentPane.add(lblGiiTnh);
		
		JLabel lblChTiu = new JLabel("Chỉ tiêu 1:");
		lblChTiu.setFont(new Font("Arial", Font.BOLD, 15));
		lblChTiu.setBounds(397, 478, 74, 13);
		contentPane.add(lblChTiu);
		
		JLabel lblChTiu_1 = new JLabel("Chỉ tiêu 2:");
		lblChTiu_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblChTiu_1.setBounds(397, 520, 74, 13);
		contentPane.add(lblChTiu_1);
		
		JLabel lblChTiu_2 = new JLabel("Chỉ tiêu 3:");
		lblChTiu_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblChTiu_2.setBounds(397, 562, 74, 13);
		contentPane.add(lblChTiu_2);
		
		tfDate = new TextField();
		tfDate.setForeground(Color.BLACK);
		tfDate.setFont(new Font("Arial", Font.PLAIN, 15));
		tfDate.setColumns(10);
		tfDate.setBounds(131, 515, 237, 20);
		contentPane.add(tfDate);
		
		tdName = new TextField();
		tdName.setForeground(Color.BLACK);
		tdName.setFont(new Font("Arial", Font.PLAIN, 15));
		tdName.setColumns(10);
		tdName.setBounds(131, 471, 237, 20);
		contentPane.add(tdName);
		
		tfID = new TextField();
		tfID.setForeground(Color.BLACK);
		tfID.setFont(new Font("Arial", Font.PLAIN, 15));
		tfID.setColumns(10);
		tfID.setBounds(131, 430, 237, 20);
		contentPane.add(tfID);
		
		tfCT3 = new TextField();
		tfCT3.setForeground(Color.BLACK);
		tfCT3.setFont(new Font("Arial", Font.PLAIN, 15));
		tfCT3.setColumns(10);
		tfCT3.setBounds(489, 559, 134, 20);
		contentPane.add(tfCT3);
		
		tdCT2 = new TextField();
		tdCT2.setForeground(Color.BLACK);
		tdCT2.setFont(new Font("Arial", Font.PLAIN, 15));
		tdCT2.setColumns(10);
		tdCT2.setBounds(489, 517, 134, 20);
		contentPane.add(tdCT2);
		
		tfCT1 = new TextField();
		tfCT1.setForeground(Color.BLACK);
		tfCT1.setFont(new Font("Arial", Font.PLAIN, 15));
		tfCT1.setColumns(10);
		tfCT1.setBounds(489, 475, 134, 20);
		contentPane.add(tfCT1);
		
		cbxProvice = new JComboBox();
		cbxProvice.setFont(new Font("Arial", Font.PLAIN, 15));
		cbxProvice.setBounds(131, 551, 237, 22);
		ArrayList<TinhThanh> listTinhThanhs = TinhThanh.getListProvice();
		for (TinhThanh tinhThanh : listTinhThanhs) {
			cbxProvice.addItem(tinhThanh.getTenTinhThanh());
		}
		contentPane.add(cbxProvice);
		
		rdbtnMale = new JRadioButton("Nam");
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setForeground(Color.BLACK);
		rdbtnMale.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnMale.setBounds(474, 436, 80, 21);
		contentPane.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Nữ");
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnFemale.setBounds(556, 436, 67, 21);
		contentPane.add(rdbtnFemale);
		
		btnGroup = new ButtonGroup();
		
		btnGroup.add(rdbtnFemale);
		btnGroup.add(rdbtnMale);
		
		JButton btnAdd = new JButton("Add");
		
		btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
		btnAdd.setBounds(650, 472, 85, 21);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(action);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Arial", Font.BOLD, 14));
		btnUpdate.setBounds(650, 514, 85, 21);
		btnUpdate.addActionListener(action);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Arial", Font.BOLD, 15));
		btnDelete.setBounds(650, 556, 85, 21);
		btnDelete.addActionListener(action);
		contentPane.add(btnDelete);
		
		btnSave = new JButton("Save");
		btnSave.setEnabled(false);
		btnSave.setFont(new Font("Arial", Font.BOLD, 15));
		btnSave.setBounds(759, 513, 101, 21);
		btnSave.addActionListener(action);
		contentPane.add(btnSave);
		
		lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Arial", Font.PLAIN, 14));
		lblError.setBounds(43, 399, 800, 27);
		contentPane.add(lblError);
		
		btnDontSave = new JButton("Don't Save");
		btnDontSave.setFont(new Font("Arial", Font.BOLD, 13));
		btnDontSave.setEnabled(false);
		btnDontSave.setBounds(759, 555, 101, 21);
		btnDontSave.addActionListener(action);
		contentPane.add(btnDontSave);
		
	}
}
