package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.*;

public class ItemTypeDAO extends BaseDAO {

  public TypeVO getTypeByItem(ItemVO vo) {
    String sql = "select * from typeitem, items where typeitem.id = items.type_id and items.id = ?";
    PreparedStatement ptst;
    ResultSet rs;

    TypeVO typeVo = new TypeVO();

    try {
      ptst = getConnection().prepareStatement(sql);
      ptst.setInt(1, vo.getId());
      rs = ptst.executeQuery();

      if (rs.next()) {
        System.out.println("acho");
        String stringSellingForm = rs.getString("typeitem.selling_form");
        SellingForm enumSellingForm = SellingForm.kg;
        switch (stringSellingForm) {
          case "kg":
            enumSellingForm = SellingForm.kg;
            break;
          case "unit":
            enumSellingForm = SellingForm.unit;
            break;
        }

        typeVo.setId(rs.getInt("typeitem.id"));
        typeVo.setName(rs.getString("typeitem.name"));
        typeVo.setTypeCode(rs.getInt("typeitem.type_code"));
        typeVo.setSellingForm(enumSellingForm);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return typeVo;
  }

  public List<ItemVO> getItemsByType(TypeVO typeVo) {

    String sql = "select * from items where type_id = ?";
    PreparedStatement ptst;
    ResultSet rs;
    List<ItemVO> items = new ArrayList<ItemVO>();

    try {
      ptst = getConnection().prepareStatement(sql);
      ptst.setInt(1, typeVo.getId());
      rs = ptst.executeQuery();

      while (rs.next()) {
        ItemVO vo = new ItemVO();

        vo.setId(rs.getInt("id"));
        vo.setName(rs.getString("name"));
        vo.setBrand(rs.getString("brand"));
        vo.setPrice(rs.getInt("price"));
        vo.setQuantStock(rs.getInt("stock_quantity"));
        vo.setBarCode(rs.getString("bar_code"));
        vo.setType(typeVo);
        items.add(vo);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return items;
  }
}