package Business.boIMPL;

import Business.Custom.InterviewBO;
import DTO.Interview;
import DTO.Student;
import Hibernate.Custom.InterviewHIB;
import Hibernate.Dao.HibernateFactory;

import java.util.List;

public class InterviewBOimpl implements InterviewBO {
    //Interview(String fullRegID, String nicNumber, String stdName, String email, String telNumber, String interviewDate, String interviewTime, String interviewPlace, String firstInterviewResult, String secondInterviewResult, String thiredInterviewResult, Student student)
    InterviewHIB interviewHIB;
    public InterviewBOimpl(){
        interviewHIB= (InterviewHIB) HibernateFactory.getHibernateFactory().getSuperDAO(HibernateFactory.HIBFactoryTypes.INTERVIEW);
    }
    @Override
    public boolean addInterview(Interview dto) throws Exception {
        Hibernate.Entity.Interview interview =new Hibernate.Entity.Interview(dto.getFullRegID(),dto.getNicNumber(),dto.getStdName(),dto.getEmail(),dto.getTelNumber(),dto.getInterviewDate(),dto.getInterviewTime(),dto.getInterviewPlace(),dto.getFirstInterviewResult(),dto.getSecondInterviewResult(),dto.getThiredInterviewResult(),dto.getStudent());
        return interviewHIB.add(interview);
    }

    @Override
    public boolean updateInterview(Interview dto) throws Exception {
        Hibernate.Entity.Interview interview=new Hibernate.Entity.Interview(dto.getFullRegID(),dto.getNicNumber(),dto.getStdName(),dto.getEmail(),dto.getTelNumber(),dto.getInterviewDate(),dto.getInterviewTime(),dto.getInterviewPlace(),dto.getFirstInterviewResult(),dto.getSecondInterviewResult(),dto.getThiredInterviewResult(),dto.getStudent());
        return interviewHIB.update(interview);
    }

    @Override
    public boolean deletInterview(String id) throws Exception {
        return interviewHIB.delete(id);
    }

    @Override
    public List<Interview> getAllInterviews() throws Exception {
        return null;
    }

    @Override
    public Interview searchInterview(String id) throws Exception {
        return null;
    }

    @Override
    public List<Interview> searchANYthing(String key) throws Exception {
        return null;
    }

    @Override
    public boolean placeInterview(Interview interview, Student student) throws Exception {
        return false;
    }
}
