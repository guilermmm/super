package model.bo;

import java.sql.SQLException;
import java.util.List;

import model.dao.TypeDAO;
import model.vo.TypeVO;

public class TypeBO implements BaseInterBO<TypeVO> {
  TypeDAO dao = new TypeDAO();

  public void insert(TypeVO vo) throws SQLException {
    dao.insert(vo);
    
  }

  public void remove(TypeVO vo) throws SQLException {
    dao.remove(vo);
    
  }

  public void edit(TypeVO vo) throws SQLException {
    dao.edit(vo);
    
  }

  public List<TypeVO> list() throws SQLException {
    return dao.list();
  }
  
}
