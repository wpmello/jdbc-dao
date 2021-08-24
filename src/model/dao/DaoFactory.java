package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	// the way this class was instantiated is to invite implementation will be exposed.
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
