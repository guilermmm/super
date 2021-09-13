package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.vo.UserVO;

public class UserDAO extends BaseDAO {

    public void insert(UserVO vo) {
        conn = getConnection();
        String sql = "insert into users (name,cpf,permission) values (?,?,?)";
        PreparedStatement ptst;
        try {
            ptst = conn.prepareStatement(sql);
            ptst.setString(1, vo.getName());
            ptst.setString(2, vo.getCpf());
            ptst.setString(3, vo.getPermission().toString());
            ptst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remove(UserVO vo) {
        conn = getConnection();
        String sql = "delete from users where name = ?";
        PreparedStatement ptst;
        try {
            ptst = conn.prepareStatement(sql);
            ptst.setString(1, vo.getName());
            ptst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<UserVO> list() {
        conn = getConnection();
        String sql = "select * from users";
        Statement st;
        ResultSet rs;
        List<UserVO> users = new ArrayList<UserVO>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                UserVO vo = new UserVO();
                vo.setId(rs.getInt("id"));
                vo.setName(rs.getString("name"));
                vo.setCpf(rs.getString("cpf"));
                users.add(vo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;

    }

    public void edit(UserVO vo) {
        conn = getConnection();
        String sql = "update users set name = ? where id = ?";
        PreparedStatement ptst;
        try {
            ptst = conn.prepareStatement(sql);
            ptst.setString(1, vo.getName());
            ptst.setInt(2, vo.getId());
            ptst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}