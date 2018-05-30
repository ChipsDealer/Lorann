package model;

import com.mysql.cj.api.mysqla.result.Resultset;

public interface IModel {
	public Resultset getProcedureMotion(String id);
	public Resultset getProcedureMotionLess(String id);
	public void CreateMap();

}
