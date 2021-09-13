package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.vo.TypeVO;

public class TypeDAO extends BaseDAO {

    public void insert(TypeVO vo) {
        conn = getConnection();
        String sql = "insert into typeitem (name,type_code,selling_form) values (?,?,?)";
        PreparedStatement ptst;
        try {
            ptst = conn.prepareStatement(sql);
            ptst.setString(1, vo.getName());
            ptst.setInt(2, vo.getTypeCode());
            ptst.setString(3, vo.getSellingForm().toString());
            ptst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}