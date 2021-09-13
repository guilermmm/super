package model.dao;

import java.util.List;
import model.vo.*;

public class Test {
	public static void main(String[] args) {
		BaseDAO dao = new BaseDAO();
		System.out.println(dao.getConnection());

		int a = 9;
		int b = 7;

		UserDAO dao2 = new UserDAO();
		UserVO vo = new UserVO();
		vo.setCpf("712.018.454-75");
		vo.setName("mlerm");
		vo.setId(a);
		vo.setPermission(Permission.adm);
		dao2.insert(vo);

		UserVO vo1 = new UserVO();
		vo1.setCpf("123.456.789-01");
		vo1.setName("lermlerm");
		// dao2.insert(vo1);

		UserVO vo2 = new UserVO();
		vo2.setCpf("848.952.144-12");
		vo2.setName("mguilerm");
		vo2.setId(b);
		// dao2.insert(vo2);

		// dao2.edit(vo);
		// dao2.edit(vo2);

		TypeDAO dao4 = new TypeDAO();

		TypeVO vo3 = new TypeVO();
		vo3.setName("fruta");
		vo3.setSellingForm(SellingForm.kg);
		vo3.setTypeCode(1);
		dao4.insert(vo3);

		List<UserVO> users = dao2.list();

		for (UserVO v0 : users) {
			System.out.println(v0.getName());
		}

	}
}
