package Business;

import Business.boIMPL.CourseBOimpl;
import Business.boIMPL.StudentBOimpl;

public class BOFactory {

    public static BOFactory boFactory;

    public static BOFactory getBoFactory(){
        if(boFactory==null){
            boFactory=new BOFactory();
        }
        return boFactory;
    }
    public enum boTypes{
        STUDENT,COURSE
    }
    public SuperBO getSuperBO(boTypes types){
        switch (types){
            case STUDENT:
                return new StudentBOimpl();
            case COURSE:
                return new CourseBOimpl();
                default:
                    return null;
        }

    }
}
