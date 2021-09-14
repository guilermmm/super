package model.dao;

import java.util.List;
import model.vo.*;

public class Test {
	public static void main(String[] args) {
		BaseDAO dao = new BaseDAO();
		System.out.println(dao.getConnection());

		int a = 9;
		int b = 7;
		int c = 11;

		// Testing user

		UserDAO dao2 = new UserDAO();
		UserVO uservo1 = new UserVO();
		uservo1.setCpf("712.018.454-75");
		uservo1.setName("mlerm");
		uservo1.setId(a);
		uservo1.setPermission(Permission.adm);
		// dao2.insert(uservo1);

		UserVO uservo2 = new UserVO();
		uservo2.setCpf("123.456.789-01");
		uservo2.setName("lermlerm");
		uservo2.setId(c);
		uservo2.setPermission(Permission.non_adm);
		// dao2.insert(uservo2);

		UserVO uservo3 = new UserVO();
		uservo3.setCpf("848.952.144-12");
		uservo3.setName("mguilerm");
		uservo3.setId(b);
		uservo3.setPermission(Permission.non_adm);
		// dao2.insert(uservo3);

		// dao2.edit(uservo1);
		// dao2.edit(uservo2);
		// dao2.edit(uservo3);

		// List<UserVO> users = dao2.list();

		// for (UserVO v0 : users) {
		// System.out.println(v0);
		// }

		// Testing type

		TypeDAO dao4 = new TypeDAO();

		int d = 2;

		TypeVO typevo1 = new TypeVO();
		typevo1.setName("salgado");
		typevo1.setSellingForm(SellingForm.unit);
		typevo1.setTypeCode(10);
		typevo1.setId(d);

		dao4.edit(typevo1);
		// dao4.insert(typevo1);

		TypeVO typevo2 = new TypeVO();
		typevo2.setName("industrializado");
		typevo2.setSellingForm(SellingForm.unit);
		typevo2.setTypeCode(5);
		// dao4.insert(typevo2);

		// List<TypeVO> types = dao4.list();

		// for (TypeVO v0 : types) {
		// System.out.println(v0);
		// }
	}
}
