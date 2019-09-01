package Hibernate.Dao;

import Hibernate.IMPL.CourseHIBimpl;
import Hibernate.IMPL.StudentHIBimpl;

public class HibernateFactory {
    private static HibernateFactory hibernateFactory;

    public enum HIBFactoryTypes{
        STUDENT,COURSE
    }
    public static HibernateFactory getHibernateFactory(){
        if(hibernateFactory==null){
            hibernateFactory=new HibernateFactory();
        }
        return hibernateFactory;
    }
    public SuperDAO getSuperDAO(HIBFactoryTypes types){
        switch (types){
            case COURSE:
                return new CourseHIBimpl();
            case STUDENT:
                return new StudentHIBimpl();
                default:
                    return null;
        }
    }
}
