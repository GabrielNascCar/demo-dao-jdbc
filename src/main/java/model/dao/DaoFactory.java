package model.dao;

import db.DB;
import model.dao.impl.SallerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SallerDaoJDBC(DB.getConnection());
    }

}
