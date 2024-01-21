package Model;
public class Phong {
	public String MaPhong;
	private String TenPhong;
	private double DienTich;
	private int Tang;
	private int SoNguoiO;
	private double GiaTien;
	public Phong() {
	}
	public Phong(String maPhong, String tenPhong, double dienTich, int tang, int soNguoiO, double Gia) {
	
		MaPhong = maPhong;
		TenPhong = tenPhong;
		DienTich = dienTich;
		Tang = tang;
		SoNguoiO = soNguoiO;
		Gia = Gia;
	}
	public String getMaPhong() {
		return MaPhong;
	}
	public void setMaPhong(String maPhong) {
		MaPhong = maPhong;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}
	public double getDienTich() {
		return DienTich;
	}
	public void setDienTich(double dienTich) {
		DienTich = dienTich;
	}
	public int getTang() {
		return Tang;
	}
	public void setTang(int tang) {
		Tang = tang;
	}
	public int getSoNguoiO() {
		return SoNguoiO;
	}
	public void setSoNguoiO(int soNguoiO) {
		SoNguoiO = soNguoiO;
	}
	
	public double getGiaTien() {
		return GiaTien;
	}
	public void setGiaTien(double giaTien) {
		GiaTien = giaTien;
	}
	@Override
	public String toString() {
		return "Phong [MaPhong=" + MaPhong + ", TenPhong=" + TenPhong + ", DienTich=" + DienTich + ", Tang=" + Tang
				+ ", SoNguoiO=" + SoNguoiO + "]";
	}
	
	

}
