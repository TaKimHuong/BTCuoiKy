package Controller;

import java.util.ArrayList;

import Model.SinhVien;

public class SinhVienBus {
	public  ArrayList<SinhVien> listSinhVien() {
        return new SinhVienDao().listSinhVien();
    }
//	  public void ThemSinhVien(SinhVien sv) {
//	        new SinhVien().ThemSinhVien(sv);
//	    }

}
