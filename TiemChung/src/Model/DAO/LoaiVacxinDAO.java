package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Bean.LoaiVacxin;

public class LoaiVacxinDAO {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=FPT";
	String userName = "sa";
	String password = "123";
	Connection cn;
	
	public void KetNoi()throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		cn = DriverManager.getConnection(url, userName, password);
		System.out.println("Ket noi thanh cong");
	}
	ArrayList<LoaiVacxin> ds;
	public ArrayList<LoaiVacxin> getLoaiVacxin()throws Exception{
		String sql = "select * from LoaiVacxin";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ResultSet rs= cmd.executeQuery();
		while (rs.next()){
			int maLoaiVacxin = rs.getInt("MaLoaiVacxin");
			String tenLoaiVacxin=rs.getString("TenLoaiVacxin");
			LoaiVacxin lv = new LoaiVacxin(maLoaiVacxin, tenLoaiVacxin);
			ds.add(lv);
		}
		rs.close();
		return ds;
	}
	
}
