package Hibernate.Dao;

import Hibernate.IMPL.CourseHIBimpl;
import Hibernate.IMPL.InterviewHIBimpl;
import Hibernate.IMPL.StudentHIBimpl;

public class HibernateFactory {
    private static HibernateFactory hibernateFactory;

    public enum HIBFactoryTypes{
        STUDENT,COURSE,INTERVIEW
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
            case INTERVIEW:
                return new InterviewHIBimpl();
                default:
                    return null;
        }
    }
}
