package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.vo.SellingForm;
import model.vo.TypeVO;

public class TypeDAO extends BaseDAO {

	public void insert(TypeVO vo) {

		String sql = "insert into typeitem (name,type_code,selling_form) values (?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getName());
			ptst.setInt(2, vo.getTypeCode());
			ptst.setString(3, vo.getSellingForm().toString());
			ptst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void remove(TypeVO vo) {

		String sql = "delete from typeitem where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getId());
			ptst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<TypeVO> list() {

		String sql = "select * from typeitem";
		Statement st;
		ResultSet rs;
		List<TypeVO> types = new ArrayList<TypeVO>();
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				TypeVO vo = new TypeVO();

				// Switch testing what enum is in selling form attribute
				String stringSellingForm = rs.getString("selling_form");
				SellingForm enumSellingForm = SellingForm.kg;
				switch (stringSellingForm) {
					case "kg":
						enumSellingForm = SellingForm.kg;
						break;
					case "unit":
						enumSellingForm = SellingForm.unit;
						break;
				}
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setTypeCode(rs.getInt("type_code"));
				vo.setSellingForm(enumSellingForm);
				types.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return types;
	}

	public void edit(TypeVO vo) {

		String sql = "update typeitem set type_code = ?, name = ?, selling_form = ? where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getTypeCode());
			ptst.setString(2, vo.getName());
			ptst.setString(3, vo.getSellingForm().toString());
			ptst.setInt(4, vo.getId());
			ptst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}