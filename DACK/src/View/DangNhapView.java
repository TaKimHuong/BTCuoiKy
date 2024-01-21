package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.mysql.cj.xdevapi.PreparableStatement;

import Controller.DBControler;
import Model.NhanVienQuanLi;

public class DangNhapView extends JFrame implements ActionListener, ItemListener {
	private JButton jButton_Dangnhap;
	private JPasswordField jtf_MatKhau;
	private JTextField jtf_Taikhoan;
	private JCheckBox jCheckBox_HienThiMk;

	public DangNhapView() {
		this.setTitle("Đăng nhập tài khoản");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(560, 250);
		this.setLocationRelativeTo(null);

		JPanel pn = new JPanel();
		pn.setLayout(new GridLayout(3, 2, 8, 8));
		URL url_icon_notpad = DangNhapView.class.getResource("person-icon.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon_notpad);
		this.setIconImage(img);

		JPanel jPanel_Center = new JPanel();
		jPanel_Center.setLayout(new BorderLayout());

		JPanel jPanel_North = new JPanel();
		JLabel jLabel_DangNhap = new JLabel("ĐĂNG NHẬP", JLabel.CENTER);
		jPanel_North.setLayout(new BorderLayout());
		JLabel jLabel_kt2 = new JLabel("    ");
		JLabel jLabel_kt3 = new JLabel("    ");
		jPanel_North.add(jLabel_kt3, BorderLayout.NORTH);
		jPanel_North.add(jLabel_kt2, BorderLayout.SOUTH);
		jPanel_North.add(jLabel_DangNhap, BorderLayout.CENTER);
		Font font = new Font("Arial", Font.CENTER_BASELINE, 30);
		jLabel_DangNhap.setFont(font);
		JPanel jPanel_Center_Center = new JPanel();
		jPanel_Center_Center.setLayout(new GridLayout(3, 3, 5, 5));
		JLabel jLabel_taiKhoan = new JLabel("TÀI KHOẢN: ", JLabel.RIGHT);

		JLabel jLabel_MatKhau = new JLabel(" MẬT KHẨU: ", JLabel.RIGHT);

		jtf_Taikhoan = new JTextField(20);
		jtf_MatKhau = new JPasswordField(20);

		jtf_MatKhau.setEchoChar('*');

		jButton_Dangnhap = new JButton("Đăng nhập");
		JPanel pn_Dn = new JPanel();
		pn_Dn.setLayout(new GridLayout(1, 2, 5, 5));

		jButton_Dangnhap.addActionListener(this);

		jtf_MatKhau.addActionListener(this);
		JLabel jLabel_East = new JLabel("     ");
		jLabel_East.setFont(font);
		JLabel jlb_Kt = new JLabel("  ");

		jCheckBox_HienThiMk = new JCheckBox("Hiển thị");
		pn_Dn.add(jCheckBox_HienThiMk);
		pn_Dn.add(jButton_Dangnhap);
		// phương thức để hiển thị mật khẩu
		jCheckBox_HienThiMk.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (jCheckBox_HienThiMk.isSelected()) {
					jtf_MatKhau.setEchoChar((char) 0);
				} else {
					jtf_MatKhau.setEchoChar('*');
				}
			}
		});

		this.setLayout(new BorderLayout());
		JLabel jLabel_KhoangTrang = new JLabel("", JLabel.CENTER);
		jLabel_KhoangTrang.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(DangNhapView.class.getResource("user-icons.png"))));
		jPanel_Center.add(jLabel_KhoangTrang, BorderLayout.WEST);
		JLabel jLaBel_South = new JLabel("  ");
		jPanel_Center_Center.add(jLabel_taiKhoan);
		jPanel_Center_Center.add(jtf_Taikhoan);
		jPanel_Center_Center.add(jLabel_MatKhau);
		jPanel_Center_Center.add(jtf_MatKhau);
		jPanel_Center_Center.add(jlb_Kt);
		jPanel_Center_Center.add(pn_Dn);
		jPanel_Center.add(jPanel_Center_Center, BorderLayout.CENTER);
		JLabel jLabel_Kt3 = new JLabel("    ");
		this.add(jLaBel_South, BorderLayout.SOUTH);
		this.add(jLabel_East, BorderLayout.EAST);
		this.add(jPanel_North, BorderLayout.NORTH);
		this.add(jPanel_Center, BorderLayout.CENTER);
		this.add(jLabel_Kt3, BorderLayout.WEST);
		new DBControler();
		this.setVisible(true);

	}

	private static boolean isPassWordCorrect(char[] in) {
		boolean isCorrect = true;
		char[] correctPass = { '1', '2', '3', '4', '5' };
		if (in.length != correctPass.length) {
			isCorrect = false;
		} else {
			isCorrect = Arrays.equals(in, correctPass);
		}
		Arrays.fill(correctPass, '0');
		return isCorrect;
	}

	// Kiểm tra mật khẩu nhập vào có hợp lệ hay không

	JFrame frame = new JFrame("Đăng nhập");

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Đăng nhập")) {
			char[] input = jtf_MatKhau.getPassword();
			if (isPassWordCorrect(input) == true && "001TK".equals(jtf_Taikhoan.getText())) {
				JOptionPane.showMessageDialog(frame, "Bạn đã đăng nhập thành công");
				new TrangChuView();
			} else {
				JOptionPane.showMessageDialog(frame, "Lỗi", cmd, JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

}
