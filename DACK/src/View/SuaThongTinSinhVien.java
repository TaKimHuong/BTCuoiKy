package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controller.DBControler;

public class SuaThongTinSinhVien extends JFrame implements ActionListener {

	public JTextField jtf_Masv;
	public DsSinhVien dssv;
	public JTextField jtf_Tensv;
	public JTextField jtf_QueQuan;
	public JTextField jtf_NoiO;
	public JTextField jtf_CCCD;
	public JTextField jtf_GioiTinh;
	public JTextField jtf_Sdt;
	public JTextField jtf_NgaySinh;
	public JTextField jtf_MaMV;
	public JTextField jtf_MaPhong;
	public DBControler db = new DBControler();
	public JLabel jlb_Masv;
	public JButton jButton_XacNhan;


	public SuaThongTinSinhVien() {
		this.setTitle("Thêm thông tin sinh viên");
		this.setSize(340, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		URL url_icon_notpad = SuaThongTinSinhVien.class.getResource("person-icon.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon_notpad);
		this.setIconImage(img);
		JLabel jLabel_SuaThongTinSv = new JLabel("Sửa thông tin sinh viên", JLabel.CENTER);
		JPanel jPanel_North = new JPanel();
		jPanel_North.setLayout(new BorderLayout());
		JLabel jLabel_kt = new JLabel("    ");
		JLabel jLabel_kt1 = new JLabel("    ");
		jPanel_North.add(jLabel_kt, BorderLayout.SOUTH);
		jPanel_North.add(jLabel_kt1, BorderLayout.NORTH);
		jPanel_North.add(jLabel_SuaThongTinSv, BorderLayout.CENTER);
		JLabel jLabel_MaNV = new JLabel("Mã nhân viên:", JLabel.RIGHT);

		jtf_MaMV = new JTextField(30);
		JLabel jLabel_MaPhong = new JLabel("Mã phòng: ", JLabel.RIGHT);
		jtf_MaPhong = new JTextField(30);
		Font font = new Font("Arial", Font.PLAIN, 25);
		jLabel_SuaThongTinSv.setFont(font);
		JLabel jLabel_Masv = new JLabel("Mã sinh viên: ", JLabel.RIGHT);
//		jtf_Masv = new JTextField(30);
		 jlb_Masv = new JLabel("Mã sinh viên");
		JLabel jLabel_Tensv = new JLabel("Tên sinh viên: ", JLabel.RIGHT);
		jtf_Tensv = new JTextField(30);
		JLabel jlb_NgaySinh = new JLabel("Ngày sinh:", JLabel.RIGHT);
		jtf_NgaySinh = new JTextField(30);
		JLabel jLabel_QuanQuan = new JLabel("Quê quán: ", JLabel.RIGHT);
		jtf_QueQuan = new JTextField(30);
		JLabel jLabel_NoiO = new JLabel("Nơi ở: ", JLabel.RIGHT);
		jtf_NoiO = new JTextField(30);
		JLabel jLabel_CCCd = new JLabel("Số CCCD : ", JLabel.RIGHT);
		jtf_CCCD = new JTextField(30);
		JLabel jLabel_GioiTinh = new JLabel("Giới tính: ", JLabel.RIGHT);
		jtf_GioiTinh = new JTextField(30);
		JPanel jPanel_Center = new JPanel();
		jPanel_Center.setLayout(new GridLayout(10, 2, 5, 5));
		JLabel jLabel_Sdt = new JLabel("Số điện thoại: ", JLabel.RIGHT);
		jtf_Sdt = new JTextField(20);
		jPanel_Center.add(jLabel_Masv);
//		jPanel_Center.add(jtf_Masv);
		jPanel_Center.add(jlb_Masv);
		jPanel_Center.add(jLabel_Tensv);
		jPanel_Center.add(jtf_Tensv);
		jPanel_Center.add(jLabel_GioiTinh);
		jPanel_Center.add(jtf_GioiTinh);
		jPanel_Center.add(jlb_NgaySinh);
		jPanel_Center.add(jtf_NgaySinh);

		jPanel_Center.add(jLabel_QuanQuan);
		jPanel_Center.add(jtf_QueQuan);
		jPanel_Center.add(jLabel_NoiO);
		jPanel_Center.add(jtf_NoiO);
		jPanel_Center.add(jLabel_CCCd);
		jPanel_Center.add(jtf_CCCD);
		jPanel_Center.add(jLabel_Sdt);
		jPanel_Center.add(jtf_Sdt);
		jPanel_Center.add(jLabel_MaNV);
		jPanel_Center.add(jtf_MaMV);
		jPanel_Center.add(jLabel_MaPhong);
		jPanel_Center.add(jtf_MaPhong);
		JLabel jLabel_kt3 = new JLabel("     ");
		JLabel jLabel_kt4 = new JLabel("     ");
		JPanel jPanel_South = new JPanel();
		jPanel_South.setLayout(new FlowLayout());
		jButton_XacNhan = new JButton("Xác nhận");
		jButton_XacNhan.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SuaThongTinSinhVien.class.getResource("edit.png"))));
		jButton_XacNhan.addActionListener(this);
		JButton jButton_QuayLai = new JButton("Quay lại");
		jButton_QuayLai.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SuaThongTinSinhVien.class.getResource("cancel.png"))));
		jButton_QuayLai.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
//				try {
//					// Thêm dữ liệu của sinh viên
////					String masv = jtf_Masv.getText();
//					String masv = jlb_Masv.getText();
//					String tenSinhVien = jtf_Tensv.getText();
//					String GioiTinh = jtf_GioiTinh.getText();
//					String QueQuan = jtf_QueQuan.getText();
//					String SDT = jtf_Sdt.getText();
//					String NoiO = jtf_NoiO.getText();
//					String MaPhong = jtf_MaPhong.getText();
//					String ngaysinh = jtf_NgaySinh.getText();
//					String MaNhanVien = jtf_MaMV.getText();
//					String Maphong = jtf_MaPhong.getText();
//					String CCCD = jtf_CCCD.getText();
//					SinhVien sv = new SinhVien(masv, tenSinhVien, GioiTinh, ngaysinh, QueQuan, NoiO, CCCD, SDT,
//							MaNhanVien, Maphong);
//					DsSinhVien dsSinhVien = new DsSinhVien();
//					dsSinhVien.ThemHoacSuaSinhVien(sv);
//					System.out.println("Thành công");
//				} catch (Exception e2) {
//					e2.printStackTrace();
//				}
				new DsSinhVien();
			}
		});
		jPanel_South.add(jButton_XacNhan);
		jPanel_South.add(jButton_QuayLai);
		this.add(jLabel_kt3, BorderLayout.WEST);
		this.add(jLabel_kt4, BorderLayout.EAST);
		this.add(jPanel_North, BorderLayout.NORTH);
		this.add(jPanel_Center, BorderLayout.CENTER);
		this.add(jPanel_South, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int b = JOptionPane.showOptionDialog(null, "Bạn muốn sửa thông tin sinh viên không?", "Xác nhận",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		if (e.getActionCommand().equals("Xác nhận") ) {
			if (b == JOptionPane.YES_OPTION) {
				try {
					// Thêm dữ liệu của sinh viên
////					String masv = jtf_Masv.getText();
//					String masv = jlb_Masv.getText();
//					String tenSinhVien = jtf_Tensv.getText();
//					String GioiTinh = jtf_GioiTinh.getText();
//					String QueQuan = jtf_QueQuan.getText();
//					String SDT =jtf_Sdt.getText();
//					String NoiO = jtf_NoiO.getText();
//					String MaPhong = jtf_MaPhong.getText();
//					String ngaysinh = jtf_NgaySinh.getText();
//					String MaNhanVien = jtf_MaMV.getText();
//					String Maphong = jtf_MaPhong.getText();
//					String CCCD = jtf_CCCD.getText();
//					SinhVien sv = new SinhVien(masv, tenSinhVien, GioiTinh, ngaysinh, QueQuan, NoiO, CCCD, SDT,
//							MaNhanVien, Maphong);
					
//					
//					dsSinhVien.ThemHoacSuaSinhVien(sv);
					
						String sql = "	UPDATE `quanlikitucxa`.`sinhvienktx` SET `TenSV` = '"+jtf_Tensv.getText()+"', `GioiTinh` = '"+jtf_GioiTinh.getText()+"', `NgaySinh` = '"+jtf_NgaySinh.getText()+"', `QueQuan` = '"+jtf_QueQuan.getText()+"', `NoiO` = '"+jtf_NoiO.getText()+"', `SDT` = '"+jtf_Sdt.getText()+"', `CCCD` = '"+jtf_CCCD.getText()+"' WHERE (`MaSV` = '"+jlb_Masv.getText()+"')";
						db.stmt.executeUpdate(sql);
						DsSinhVien dsSinhVien = new DsSinhVien();
						dsSinhVien.df.fireTableDataChanged();
					System.out.println("Thành công");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				
			
			} else if (b == JOptionPane.NO_OPTION) {
				
				System.out.println("No");
			} else if (b == JOptionPane.CANCEL_OPTION) {
				System.out.println("Cancel");
			}
		}
	}

}