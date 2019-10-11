package Hibernate.IMPL;

import Hibernate.Custom.InterviewHIB;
import Hibernate.Dao.HIBCUDutill;
import Hibernate.Entity.Interview;
import Hibernate.Entity.Student;

import java.io.Serializable;
import java.util.List;

public class InterviewHIBimpl implements InterviewHIB {
    @Override
    public boolean add(Interview dto) throws Exception {
        HIBCUDutill.openSession();
        Serializable id=HIBCUDutill.session.save(dto);
        if(id!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean update(Interview dto) throws Exception {
        List<Interview>interviews=searchANYthing(dto.getFullRegID());
        HIBCUDutill.openSession();
        Interview interview1 = null;
        for( Interview interview:interviews){
            interview1=HIBCUDutill.session.load(Interview.class,interview.getInterviewID());
            interview1.setEmail(dto.getEmail());
            interview1.setTelNumber(dto.getTelNumber());
            interview1.setInterviewDate(dto.getInterviewDate());
            interview1.setInterviewPlace(dto.getInterviewPlace());
            interview1.setInterviewTime(dto.getInterviewTime());
            interview1.setFirstInterviewResult(dto.getFirstInterviewResult()); 
            interview1.setSecondInterviewResult(dto.getSecondInterviewResult());
            interview1.setThiredInterviewResult(dto.getThiredInterviewResult());
        }
        if (interview1!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }
        
    }

    @Override
    public boolean delete(String s) throws Exception {
        HIBCUDutill.openSession();
        Interview interview=HIBCUDutill.session.get(Interview.class,Integer.parseInt(s));
        HIBCUDutill.session.delete(interview);
        if(interview!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Interview search(String s) throws Exception {
        return null;
    }

    @Override
    public List<Interview> getAll() throws Exception {
        List<Interview> interviews;
        HIBCUDutill.openSession();
        interviews=HIBCUDutill.session.createNativeQuery("SELECT * FROM Interview",Interview.class).list();
        if(interviews.size()>0){
            HIBCUDutill.closeSession();
            return interviews;
        }else {
            return null;
        }
    }


    @Override
    public boolean placeInterview(Interview interview, Student student) throws Exception {
        return false;
    }

    @Override
    public List<Interview> searchANYthing(String key) throws Exception {
        List<Interview> interviews;
        HIBCUDutill.openSession();
        interviews=HIBCUDutill.session.createNativeQuery("SELECT * FROM Interview WHERE " +
                "interviewID like '%"+key+"%'or " +
                "fullRegID like '%"+key+"%'or " +
                "nicNumber like '%"+key+"%'or " +
                "stdName like '%"+key+"%'or " +
                "email like '%"+key+"%'or " +
                "telNumber like '%"+key+"%'or " +
                "interviewDate like '%"+key+"%'or " +
                "interviewTime like '%"+key+"%'or " +
                "interviewPlace like '%"+key+"%'or " +
                "firstInterviewResult like '%"+key+"%'or " +
                "secondInterviewResult like '%"+key+"%'or " +
                "thiredInterviewResult like '%"+key+"%' or " +
                "studentregNumber like '%"+key+"%'",Interview.class).list();
        if (interviews.size()>0){
            HIBCUDutill.closeSession();
            return interviews;
        }else {
            return null;
        }
    }

    @Override
    public List<Interview> searchInterviews(String key) throws Exception {
        List<Interview> interviews;
        HIBCUDutill.openSession();
        interviews=HIBCUDutill.session.createNativeQuery("SELECT * FROM Interview WHERE " +
                "studentregNumber='"+key+"'",Interview.class).list();
        if (interviews.size()>0){
            HIBCUDutill.closeSession();
            return interviews;
        }else {
            return null;
        }
    }
}
