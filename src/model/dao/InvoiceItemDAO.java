package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.vo.InvoiceItemVO;
import model.vo.InvoiceVO;

public class InvoiceItemDAO extends BaseDAO {

	public void insert(InvoiceVO invoicevo, InvoiceItemVO vo) {
		String sql = "insert into invoice_items (invoice_id, item_id, quantity) values (?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, invoicevo.getId());
			ptst.setInt(2, vo.getItem().getId());
			ptst.setInt(3, vo.getQuantity());
			ptst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void remove(InvoiceItemVO vo) {

		String sql = "delete from invoice_item where item_id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getItem().getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}