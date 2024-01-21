package View;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



public class TrangChuView extends JFrame implements ActionListener {
	private DsSinhVien dSSinhVien;
	private HopDongView hopDongView;
	private PhongView phongView;
	private ThongTinCaNhan thongTinCaNhan;

	public TrangChuView() {
		this.setTitle("Trang chủ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 550);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		JMenuBar jMenuBar_TrangChu = new JMenuBar();

		JMenu jMenu_TaiKhoan = new JMenu("Tài khoản");
		JMenuItem jMenuItem_DanhSachTaiKhoan = new JMenuItem("Thông tin cá nhân");
		jMenuItem_DanhSachTaiKhoan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ThongTinCaNhan();
			}
		});
		jMenuItem_DanhSachTaiKhoan.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TrangChuView.class.getResource("list1.png"))));
		JMenuItem jMenuItem_Thoat = new JMenuItem("Thoát");
		jMenuItem_Thoat.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TrangChuView.class.getResource("exit.png"))));
		jMenuItem_Thoat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		jMenu_TaiKhoan.add(jMenuItem_DanhSachTaiKhoan);
		jMenu_TaiKhoan.add(jMenuItem_Thoat);

		JMenu jMenu_ThongTinSinhVien = new JMenu("Thông tin sinh viên");
		JMenuItem jMenuItem_DanhsachSinhVien = new JMenuItem("Danh sách sinh viên");
		jMenuItem_DanhsachSinhVien.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TrangChuView.class.getResource("list.png"))));
		jMenuItem_DanhsachSinhVien.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new DsSinhVien();
			}
		});
		JMenuItem jMenuItem_Themsinhvien = new JMenuItem("Thêm sinh viên");
		jMenuItem_Themsinhvien.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TrangChuView.class.getResource("edit.png"))));
		jMenuItem_Themsinhvien.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new HopDongView();
			}
		});

		jMenu_ThongTinSinhVien.add(jMenuItem_DanhsachSinhVien);
		jMenu_ThongTinSinhVien.add(jMenuItem_Themsinhvien);
	
		
		JMenu jMenu_phong = new JMenu("Phòng");

		JMenuItem jMenuItem_Danhsachphong = new JMenuItem("Danh sách phòng");
		jMenuItem_Danhsachphong.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TrangChuView.class.getResource("list.png"))));
		jMenuItem_Danhsachphong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PhongView();
			}
		});
		jMenu_phong.add(jMenuItem_Danhsachphong);
		jMenuBar_TrangChu.add(jMenu_TaiKhoan);
		jMenuBar_TrangChu.add(jMenu_ThongTinSinhVien);
	
		jMenuBar_TrangChu.add(jMenu_phong);
		this.setJMenuBar(jMenuBar_TrangChu);
		URL url_icon_notpad = TrangChuView.class.getResource("person-icon.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon_notpad);
		this.setIconImage(img);
	    
        ImageIcon originalIcon = new ImageIcon("D:\\Users\\HP\\eclipse-workspace\\DACK\\src\\picture\\KiTucXa.jpg");

        
        Image originalImage = originalIcon.getImage();

        
        int newWidth = 600; 
        int newHeight = 500; 
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        
        JLabel label = new JLabel(resizedIcon);
		
		this.setLayout(new BorderLayout());
		this.add(label, BorderLayout.CENTER);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
