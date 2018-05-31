package model;

import java.sql.ResultSet;

import com.mysql.cj.api.mysqla.result.Resultset;

public interface IModel {
	public ResultSet getProcedureMotion(String id);
	public ResultSet getProcedureMotionLess(String id);
	public void CreateMap();

}
