package model.bo;

import java.sql.SQLException;
import java.util.List;

import model.dao.InvoiceDAO;
import model.vo.InvoiceVO;

public class InvoiceBO implements BaseInterBO<InvoiceVO> {
  InvoiceDAO dao = new InvoiceDAO();

  public void insert(InvoiceVO vo) throws SQLException {
    dao.insert(vo);
    
  }

  @Override
  public void remove(InvoiceVO vo) throws SQLException {
    dao.remove(vo);
    
  }

  @Override
  public void edit(InvoiceVO vo) throws SQLException {
    dao.edit(vo);
    
  }

  @Override
  public List<InvoiceVO> list() throws SQLException {
    return dao.list();
  }


}
