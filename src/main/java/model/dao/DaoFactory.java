package model.dao;

import model.dao.impl.SallerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SallerDaoJDBC();
    }

}
