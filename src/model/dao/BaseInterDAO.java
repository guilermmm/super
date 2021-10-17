package model.dao;

import java.sql.SQLException;
import java.util.List;

public interface BaseInterDAO <VO> {
	public void insert(VO enity) throws SQLException;
	public void edit(VO enity) throws SQLException;
	public void remove(VO enity) throws SQLException;
	public List<VO> list() throws SQLException;
	
}