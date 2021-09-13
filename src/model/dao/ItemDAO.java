package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.vo.ItemVO;

public class ItemDAO extends BaseDAO {

    public void insert(ItemVO vo) {
        conn = getConnection();
        String sql = "insert into items (type_id, name, brand, price, stock_quantity, bar_code) values (?,?,?,?,?,?)";
        PreparedStatement ptst;
        try {
            ptst = conn.prepareStatement(sql);
            ptst.setInt(1, vo.getType().getId());
            ptst.setString(2, vo.getName());
            ptst.setString(3, vo.getBrand());
            ptst.setInt(4, vo.getPrice());
            ptst.setInt(5, vo.getQuantStock());
            ptst.setString(6, vo.getBarCode());
            ptst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}