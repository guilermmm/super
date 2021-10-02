package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.vo.Permission;
import model.vo.UserVO;

public class UserDAO extends BaseDAO implements BaseInterDAO<UserVO>{

	public void insert(UserVO vo) {

		String sql = "insert into users (name,cpf,permission) values (?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getName());
			ptst.setString(2, vo.getCpf());
			ptst.setString(3, vo.getPermission().toString());
			ptst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void remove(UserVO vo) {

		String sql = "delete from users where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, vo.getId());
			ptst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<UserVO> list() {

		String sql = "select * from users";
		Statement st;
		ResultSet rs;
		List<UserVO> users = new ArrayList<UserVO>();
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				UserVO vo = new UserVO();

				// Switch testing what enum is in Permission attribute
				Permission enumPermission = Permission.adm;
				String stringPermission = rs.getString("permission");
				switch (stringPermission) {
					case "adm":
						enumPermission = Permission.adm;
						break;
					case "non_adm":
						enumPermission = Permission.non_adm;
						break;
				}
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setCpf(rs.getString("cpf"));
				vo.setPermission(enumPermission);
				users.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public void edit(UserVO vo) {

		String sql = "update users set name = ?, cpf = ?, permission = ? where id = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getName());
			ptst.setString(2, vo.getCpf());
			ptst.setString(3, vo.getPermission().toString());
			ptst.setInt(4, vo.getId());
			ptst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}