package model.bo;

import java.sql.SQLException;
import java.util.List;

import model.dao.UserDAO;
import model.vo.UserVO;

public class UserBO implements BaseInterBO<UserVO>{
  UserDAO dao = new UserDAO();

  public void insert(UserVO vo) throws SQLException {
    dao.insert(vo);
  }

  public void remove(UserVO vo) throws SQLException {
    dao.remove(vo);    
  }

  public void edit(UserVO vo) throws SQLException {
    dao.edit(vo);
  }

  public List<UserVO> list() throws SQLException {
    return dao.list();
  }
}