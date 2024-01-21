package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import Controller.DBControler;

public class PhongView extends JFrame implements ActionListener{
	private TrangChuView trangChuView;
	private DBControler db;
	Vector vData ;
	Vector vTitle ;
	ResultSet rs ;
	int collum = 0;
	ResultSetMetaData rss=null;
	private SuaThongTinSinhVien sua;
	private DefaultTableModel model_table;
	private DefaultTableModel df;
	private JTable jtb;
	private HopDongView suatt;
	public PhongView() {
		DBControler db = new DBControler();
		try {
			rs = db.stmt.executeQuery("SELECT * FROM quanlikitucxa.phongktx");
			rss = (ResultSetMetaData) rs.getMetaData();
			 collum = rss.getColumnCount();
			 vTitle = new Vector(collum);
				for (int i = 1; i <= collum; i++) {
					vTitle.add(rss.getColumnLabel(i));
				}
				vData = new Vector(10,10);
			while(rs.next()) {
				Vector row = new Vector(collum);
				for (int i = 1; i <= collum; i++) 
					row.add(rs.getString(i));
					vData.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
		df = new DefaultTableModel(vData, vTitle);
		jtb = new JTable(df);
		JScrollPane tb = new JScrollPane(jtb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.setTitle("Phòng");
		this.setSize(700,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		URL url_icon_notpad = PhongView.class.getResource("person-icon.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon_notpad);
		this.setIconImage(img);
		JLabel jLabel_DanhSachPhong = new JLabel("DANH SÁCH PHÒNG" , JLabel.CENTER);
		JPanel jPanel_Nouth = new JPanel();
		jPanel_Nouth.setLayout(new BorderLayout());
		jPanel_Nouth.add(jLabel_DanhSachPhong, BorderLayout.CENTER);
		JLabel jLabel_kt = new JLabel("     ");
		JLabel jLabel_kt1 = new JLabel("     ");
		jPanel_Nouth.add(jLabel_kt , BorderLayout.NORTH);
		jPanel_Nouth.add(jLabel_kt1 , BorderLayout.SOUTH);
		Font font = new Font("Arial", Font.PLAIN , 30);
		jLabel_DanhSachPhong.setFont(font);
		JPanel jPanel_Center = new JPanel();
		JButton jButton_QuayLai = new JButton("Quay lại");
		jButton_QuayLai.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(PhongView.class.getResource("cancel.png"))));
		JButton jButton_XacNhan = new JButton("Xác nhận");
		jButton_XacNhan.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(PhongView.class.getResource("edit.png"))));
		jButton_XacNhan.addActionListener(this);
		jButton_QuayLai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TrangChuView();
			}
		});
		

		jPanel_Center.setLayout(new BorderLayout());
		JLabel jLabel_KhoangCach = new JLabel("   ");
		JLabel jLabel_KhoangCach1 = new JLabel("   ");
		jPanel_Center.add(tb, BorderLayout.CENTER);
		jPanel_Center.add(jLabel_KhoangCach1 , BorderLayout.WEST);
		jPanel_Center.add(jLabel_KhoangCach , BorderLayout.EAST);
		JPanel jPanel_South = new JPanel();
		jPanel_South.setLayout(new FlowLayout());
		jPanel_South.add(jButton_XacNhan);
		jPanel_South.add(jButton_QuayLai);
		this.setLayout(new BorderLayout());
		this.add(jPanel_Center, BorderLayout.CENTER);
		this.add(jPanel_South, BorderLayout.SOUTH);
		this.add(jPanel_Nouth, BorderLayout.NORTH);
		this.setVisible(true);
	}
	public void HienThiThongTinPhong() {
		suatt = new HopDongView();
		model_table = (DefaultTableModel) jtb.getModel();
		int i_row = jtb.getSelectedRow();
		String MaPhong = model_table.getValueAt(i_row, 0) + "";
		String TenPhong = model_table.getValueAt(i_row, 1) + "";
		suatt.jtf_MaPhong.setText(MaPhong);
		suatt.jtf_TenPhong.setText(TenPhong);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String a = e.getActionCommand();
		if (a.equals("Xác nhận")) {
			HienThiThongTinPhong();
		}
	}
}
