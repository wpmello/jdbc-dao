package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
	
		// we invoke our Interface and we instanciants it with our 'DaoFactory' and that's why the implementation wont exposed it
		SellerDao sellerDao = DaoFactory.createSellerDao();
	}
}
  