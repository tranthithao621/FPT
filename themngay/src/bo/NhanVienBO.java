package bo;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import bean.NhanVien;
import dao.NhanVienDAO;

public class NhanVienBO {
	NhanVienDAO nv = new NhanVienDAO();
	public ArrayList<NhanVien> getList() throws SQLException{
		return nv.getList();
	}
	public void themNV(String manv,String ngaysinh) throws SQLException, ParseException{
		nv.themNhanVien(manv, ngaysinh);
	}
	public void suaNV(String manv,String ngaysinh) throws SQLException, ParseException{
		nv.suaNhanVien(manv, ngaysinh);
	} 
	public NhanVien getNV(String manv) throws SQLException{
		return nv.getNV(manv);
	}
}
