package bean;

import java.util.Date;

public class NhanVien {
	private String manv;
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public NhanVien(String manv, Date ngaysinh) {
		super();
		this.manv = manv;
		this.ngaysinh = ngaysinh;
	}
	private Date ngaysinh;
}
