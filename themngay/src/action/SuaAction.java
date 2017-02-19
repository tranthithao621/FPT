package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bo.NhanVienBO;
import form.NhanVienForm;

public class SuaAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		NhanVienForm f = (NhanVienForm) form;
		NhanVienBO nv = new NhanVienBO();
		String manv = f.getManv();
		if("submit".equals(f.getSubmit())){
			String ngaysinh = f.getNgaysinh();
			nv.suaNV(manv, ngaysinh);
			return mapping.findForward("thanhCong");
		}else{
			f.setManv(manv);
			f.setNgaysinh(nv.getNV(manv).getNgaysinh().toString());
			return mapping.findForward("thatBai");
		}
	}
	
}
