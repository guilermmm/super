package model.bo;

import java.sql.SQLException;
import java.util.List;

import model.dao.ItemDAO;
import model.dao.ItemTypeDAO;
import model.vo.ItemVO;
import model.vo.TypeVO;

public class ItemBO implements BaseInterBO<ItemVO> {
  ItemDAO dao = new ItemDAO();
  ItemTypeDAO itemtypedao = new ItemTypeDAO();

  public void insert(ItemVO vo) throws SQLException {
    dao.insert(vo);
    
  }

  public void remove(ItemVO vo) throws SQLException {
    dao.remove(vo);
    
  }

  public void edit(ItemVO vo) throws SQLException {
    dao.edit(vo);
    
  }

  public List<ItemVO> list() throws SQLException {
    List<ItemVO> items = dao.list();
    for(ItemVO v0 : items){
      TypeVO typeofitem = itemtypedao.getTypeByItem(v0);
      v0.setType(typeofitem);
    }
    
    return items;
  }
  
}
