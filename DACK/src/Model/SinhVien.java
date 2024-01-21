package Model;

import java.sql.Date;
import java.util.Objects;



public class SinhVien {
	
	private String maSV;
	private String tenSinhVien;
	private String GioiTinh;
	private String ngaySinh;
	private String QueQuan;
	private String NoiO;
	private String CCCD;
	private String SDT;
	public String MaNhanVien;
	public String MaPhong;
	public SinhVien() {
		
	}
	public SinhVien(String maSV, String tenSinhVien, String gioiTinh, String ngaySinh, String queQuan, String noiO,
			String cCCD, String sDT, String maNhanVien, String maPhong) {
		super();
		this.maSV = maSV;
		this.tenSinhVien = tenSinhVien;
		GioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		QueQuan = queQuan;
		NoiO = noiO;
		CCCD = cCCD;
		SDT = sDT;
		MaNhanVien = maNhanVien;
		MaPhong = maPhong;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getQueQuan() {
		return QueQuan;
	}
	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}
	public String getNoiO() {
		return NoiO;
	}
	public void setNoiO(String noiO) {
		NoiO = noiO;
	}
	public String getCCCD() {
		return CCCD;
	}
	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public String getMaPhong() {
		return MaPhong;
	}
	public void setMaPhong(String maPhong) {
		MaPhong = maPhong;
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", tenSinhVien=" + tenSinhVien + ", GioiTinh=" + GioiTinh + ", ngaySinh="
				+ ngaySinh + ", QueQuan=" + QueQuan + ", NoiO=" + NoiO + ", CCCD=" + CCCD + ", SDT=" + SDT
				+ ", MaNhanVien=" + MaNhanVien + ", MaPhong=" + MaPhong + "]";
	}

	
	
	
}
