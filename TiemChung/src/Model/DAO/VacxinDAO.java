package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Bean.Vacxin;

public class VacxinDAO {
	
	String url = "jdbc:sqlserver://localhost:1433;databaseName=FPT";
	String userName = "sa";
	String password = "123";
	Connection cn;
	
	public void KetNoi()throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		cn = DriverManager.getConnection(url, userName, password);
		System.out.println("Ket noi thanh cong");
	}
	
	ArrayList<Vacxin> ds;
	public ArrayList<Vacxin> getVacxin() throws Exception{
		KetNoi();
		String sql ="select * from Vacxin";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ResultSet rs= cmd.executeQuery();
		while(rs.next()){
			int maVacxin =rs.getInt("MaVacxin");
			String tenVacxin =rs.getString("TenVacxin");
			int maLoaiVacxin =rs.getInt("maLoaiVacxin");
			int tuoiToiThieu =rs.getInt("tuoiToiThieu");
			int tuoiToiDa =rs.getInt("TuoiToiDa");
			int soMui =rs.getInt("SoMui");
			Vacxin v = new Vacxin(maVacxin, tenVacxin, maLoaiVacxin, tuoiToiThieu, tuoiToiDa, soMui);
			ds.add(v);
		}
		rs.close();
		cmd.close();
		return ds;
	}
	
}
