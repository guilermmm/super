package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.vo.InvoiceVO;

public class InvoiceDAO extends BaseDAO {

	public void insert(InvoiceVO vo) {
		String sql = "insert into invoice (total_value) value (?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getTotalValue());
			ptst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void remove(InvoiceVO vo) {
		String sql = "delete from invoice where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}