package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.vo.InvoiceVO;

public class InvoiceDAO extends BaseDAO implements BaseInterDAO<InvoiceVO>{

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

	public void edit(InvoiceVO vo) {

		String sql = "update invoice set total_value where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getTotalValue());
			ptst.setInt(2, vo.getId());
			ptst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<InvoiceVO> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}