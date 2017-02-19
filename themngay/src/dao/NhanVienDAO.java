package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import bean.NhanVien;

public class NhanVienDAO {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=themngay";
	String userName = "sa";
	String password = "123";
	Connection connection;
	
	void connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		}
	}
	public ArrayList<NhanVien> getList() throws SQLException{
		connect();
		PreparedStatement pr = null;
		ResultSet rs = null;
		String sql = "select manv,ngaysinh from nhanvien";
		pr = connection.prepareStatement(sql);
		rs = pr.executeQuery();
		ArrayList<NhanVien> lst = new ArrayList<>();
		while(rs.next()){
			lst.add(new NhanVien(rs.getString(1), rs.getDate(2)));
		}
		return lst;
	}
	public void themNhanVien(String manv,String ngaysinh) throws SQLException, ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		connect();
		PreparedStatement pr = null;
		String sql = "INSERT INTO nhanvien  (manv, ngaysinh) VALUES  (?,?)";
		pr = connection.prepareStatement(sql);
		pr.setString(1, manv);
		pr.setDate(2, new Date(sdf.parse(ngaysinh).getTime()));
		pr.executeUpdate();
	}
	public void suaNhanVien(String manv,String ngaysinh) throws SQLException, ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		connect();
		PreparedStatement pr = null;
		String sql ="UPDATE  nhanvien SET ngaysinh =? where manv=?";
		pr = connection.prepareStatement(sql);
		pr.setString(2, manv);
		pr.setDate(1, new Date(sdf.parse(ngaysinh).getTime()));
		pr.executeUpdate();
	}
	public NhanVien getNV(String manv) throws SQLException{
		connect();
		PreparedStatement pr = null;
		ResultSet rs = null;
		String sql ="select manv,ngaysinh from nhanvien where manv =?";
		pr = connection.prepareStatement(sql);
		pr.setString(1, manv);
		rs = pr.executeQuery();
		if(rs.next()){
			NhanVien nv = new NhanVien(manv, rs.getDate(2));
			return nv;
		}
		return null;
	}
}
