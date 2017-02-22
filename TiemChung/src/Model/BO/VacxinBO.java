package Model.BO;

import java.util.ArrayList;

import Model.Bean.Vacxin;
import Model.DAO.VacxinDAO;

public class VacxinBO {
	
	VacxinDAO v = new VacxinDAO();
	
	public ArrayList<Vacxin> getVacxin() throws Exception{
		return v.getVacxin();
	}
}
