package Model.Bean;

import java.util.Date;

public class CTVacxin {
	
	private int maCTVacxin;
	public CTVacxin(int maCTVacxin, Date hanSuDung, int giaBan, String xuatXu, int soLuong, int maLoNhap) {
		super();
		this.maCTVacxin = maCTVacxin;
		this.hanSuDung = hanSuDung;
		this.giaBan = giaBan;
		this.xuatXu = xuatXu;
		this.soLuong = soLuong;
		this.maLoNhap = maLoNhap;
	}
	public int getMaCTVacxin() {
		return maCTVacxin;
	}
	public void setMaCTVacxin(int maCTVacxin) {
		this.maCTVacxin = maCTVacxin;
	}
	public Date getHanSuDung() {
		return hanSuDung;
	}
	public void setHanSuDung(Date hanSuDung) {
		this.hanSuDung = hanSuDung;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getMaLoNhap() {
		return maLoNhap;
	}
	public void setMaLoNhap(int maLoNhap) {
		this.maLoNhap = maLoNhap;
	}
	private Date hanSuDung;
	private int giaBan;
	private String xuatXu;
	private int soLuong;
	private int maLoNhap;
}
