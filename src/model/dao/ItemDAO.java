package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.vo.ItemVO;

public class ItemDAO extends BaseDAO implements BaseInterDAO<ItemVO>{

	public void insert(ItemVO vo) {

		String sql = "insert into items (type_id, name, brand, price, stock_quantity, bar_code) values (?,?,?,?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
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

	public void remove(ItemVO vo) {

		String sql = "delete from items where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<ItemVO> list() {

		String sql = "select * from items";
		Statement st;
		ResultSet rs;
		List<ItemVO> items = new ArrayList<ItemVO>();
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				ItemVO vo = new ItemVO();

				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setBrand(rs.getString("brand"));
				vo.setPrice(rs.getInt("price"));
				vo.setQuantStock(rs.getInt("stock_quantity"));
				vo.setBarCode(rs.getString("bar_code"));
				items.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	public void edit(ItemVO vo) {

		String sql = "update items set type_id = ?, name = ?, brand = ?, price = ?, stock_quantity = ?, bar_code = ? where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);

			ptst.setInt(1, vo.getType().getId());
			ptst.setString(2, vo.getName());
			ptst.setString(3, vo.getBrand());
			ptst.setInt(4, vo.getPrice());
			ptst.setInt(5, vo.getQuantStock());
			ptst.setString(6, vo.getBarCode());
			ptst.setInt(7, vo.getId());
			ptst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}