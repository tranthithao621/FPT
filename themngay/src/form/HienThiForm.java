package form;
import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import bean.*;
public class HienThiForm extends ActionForm{
	private String manv;
	private ArrayList<NhanVien> lst;
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public ArrayList<NhanVien> getLst() {
		return lst;
	}
	public void setLst(ArrayList<NhanVien> lst) {
		this.lst = lst;
	}
}
