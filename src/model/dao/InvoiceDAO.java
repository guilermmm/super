package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.vo.InvoiceVO;

public class InvoiceDAO extends BaseDAO {

    public void insert(InvoiceVO vo) {
        conn = getConnection();
        String sql = "insert into invoice (total_value) value (?)";
        PreparedStatement ptst;
        try {
            ptst = conn.prepareStatement(sql);
            ptst.setInt(1, vo.getTotalValue());
            ptst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}