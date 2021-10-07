package model.bo;

import java.sql.SQLException;
import java.util.List;

public interface BaseInterBO <VO>{
  public void insert(VO vo) throws SQLException;
  public void remove(VO vo) throws SQLException;
  public void edit(VO vo) throws SQLException;
  public List<VO> list() throws SQLException;
}