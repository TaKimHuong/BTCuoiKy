package Controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import Model.SinhVien;

public class SinhVienDao {
	

	public ArrayList<SinhVien> listSinhVien() {
		
		ArrayList<SinhVien> res=new ArrayList<SinhVien>();
		try {
			ResultSet rs= new DBControler().queryDB("SELECT * FROM quanlikitucxa.sinhvienktx");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
        
	
		return new ArrayList<SinhVien>();
	}
	
    
}
