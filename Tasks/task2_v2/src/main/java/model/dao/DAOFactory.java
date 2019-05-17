package model.dao;

import model.dao.impl.JDBCDaoFactory;
import model.entity.Conference;

public abstract class DAOFactory {

    private static DAOFactory daoFactory;

    public abstract ConferenceDAO createConferenceDao();
    public abstract ReportDAO createReportDao();
    public abstract RestDAO createRestDao();
    public abstract CoffeeBreakDAO createCoffeeBreakDao();

    public static DAOFactory getInstance(){
        if( daoFactory == null ){
            synchronized (DAOFactory.class){
                if(daoFactory==null){
                    DAOFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }

}
