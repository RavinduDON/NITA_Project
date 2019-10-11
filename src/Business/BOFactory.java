package Business;

import Business.boIMPL.CourseBOimpl;
import Business.boIMPL.InterviewBOimpl;
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
        STUDENT,COURSE,INTERVIEW
    }
    public SuperBO getSuperBO(boTypes types){
        switch (types){
            case STUDENT:
                return new StudentBOimpl();
            case COURSE:
                return new CourseBOimpl();
            case INTERVIEW:
                return new InterviewBOimpl();
                default:
                    return null;
        }

    }
}
