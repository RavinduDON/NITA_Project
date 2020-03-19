package Business.boIMPL;

import Business.Custom.InterviewBO;
import DTO.Interview;
import DTO.Student;
import Hibernate.Custom.InterviewHIB;
import Hibernate.Dao.HibernateFactory;

import java.util.ArrayList;
import java.util.List;

public class InterviewBOimpl implements InterviewBO {
    //Interview(String fullRegID, String nicNumber, String stdName, String email, String telNumber, String interviewDate, String interviewTime, String interviewPlace, String firstInterviewResult, String secondInterviewResult, String thiredInterviewResult, Student student)
    InterviewHIB interviewHIB;
    public InterviewBOimpl(){
        interviewHIB= (InterviewHIB) HibernateFactory.getHibernateFactory().getSuperDAO(HibernateFactory.HIBFactoryTypes.INTERVIEW);
    }
    @Override
    public boolean addInterview(Interview dto) throws Exception {
        Hibernate.Entity.Student student=new Hibernate.Entity.Student(dto.getStudent().getRegNumber(),dto.getStudent().getName(),dto.getStudent().getDate(),dto.getStudent().getEmail(),dto.getStudent().getTelNumber(),dto.getStudent().getAddress(),dto.getStudent().getNicNumber(),dto.getStudent().getTradeOne(),dto.getStudent().getTradeTwo(),dto.getStudent().getTradeThree(),dto.getStudent().getFullRegId(),dto.getStudent().getDob(),dto.getStudent().getTrainingType());
        Hibernate.Entity.Interview interview =new Hibernate.Entity.Interview(dto.getFullRegID(),dto.getNicNumber(),dto.getStdName(),dto.getEmail(),dto.getTelNumber(),dto.getInterviewDate(),dto.getInterviewTime(),dto.getInterviewPlace(),dto.getFirstInterviewResult(),dto.getSecondInterviewResult(),dto.getThiredInterviewResult(),student);
        return interviewHIB.add(interview);
    }

    @Override
    public boolean updateInterview(Interview dto) throws Exception {
        //Hibernate.Entity.Student student=new Hibernate.Entity.Student(dto.getStudent().getRegNumber(),dto.getStudent().getName(),dto.getStudent().getDate(),dto.getStudent().getEmail(),dto.getStudent().getTelNumber(),dto.getStudent().getAddress(),dto.getStudent().getNicNumber(),dto.getStudent().getTradeOne(),dto.getStudent().getTradeTwo(),dto.getStudent().getTradeThree(),dto.getStudent().getFullRegId(),dto.getStudent().getDob(),dto.getStudent().getTrainingType());

        Hibernate.Entity.Interview interview=new Hibernate.Entity.Interview(dto.getFullRegID(),dto.getNicNumber(),dto.getStdName(),dto.getEmail(),dto.getTelNumber(),dto.getInterviewDate(),dto.getInterviewTime(),dto.getInterviewPlace(),dto.getFirstInterviewResult(),dto.getSecondInterviewResult(),dto.getThiredInterviewResult());
        return interviewHIB.update(interview);
    }

    @Override
    public boolean deletInterview(String id) throws Exception {
        return interviewHIB.delete(id);
    }

    @Override
    public List<Interview> getAllInterviews() throws Exception {
        List<Hibernate.Entity.Interview> allInterviews=interviewHIB.getAll();
        List<Interview> interviews=new ArrayList<>();
        for(Hibernate.Entity.Interview interview:allInterviews){
            //Student student=new Student(interview.getStudent().getRegNumber(),interview.getStudent().getSname(),interview.getStudent().getRdate(),interview.getStudent().getEmail(),interview.getStudent().getTelNumber(),interview.getStudent().getAddress(),interview.getStudent().getNicNumber(),interview.getStudent().getTradeOne(),interview.getStudent().getTradeTwo(),interview.getStudent().getTradeThree(),interview.getStudent().getFullRegId(),interview.getStudent().getDob(),interview.getStudent().getTrainingType());
            Interview dto=new Interview(interview.getInterviewID(),interview.getFullRegID(),interview.getNicNumber(),interview.getStdName(),interview.getEmail(),interview.getTelNumber(),interview.getInterviewDate(),interview.getInterviewTime(),interview.getInterviewPlace(),interview.getFirstInterviewResult(),interview.getSecondInterviewResult(),interview.getThiredInterviewResult());
            interviews.add(dto);
        }
        return interviews;
    }

    @Override
    public Interview searchInterview(String id) throws Exception {
        return null;
    }

    @Override
    public List<Interview> searchANYthing(String key) throws Exception {
        List<Hibernate.Entity.Interview> allInterviews=interviewHIB.searchANYthing(key);
        List<Interview> interviews=new ArrayList<>();
        for(Hibernate.Entity.Interview interview:allInterviews){
            //Student student=new Student(interview.getStudent().getRegNumber(),interview.getStudent().getSname(),interview.getStudent().getRdate(),interview.getStudent().getEmail(),interview.getStudent().getTelNumber(),interview.getStudent().getAddress(),interview.getStudent().getNicNumber(),interview.getStudent().getTradeOne(),interview.getStudent().getTradeTwo(),interview.getStudent().getTradeThree(),interview.getStudent().getFullRegId(),interview.getStudent().getDob(),interview.getStudent().getTrainingType());

            Interview dto=new Interview(interview.getInterviewID(),interview.getFullRegID(),interview.getNicNumber(),interview.getStdName(),interview.getEmail(),interview.getTelNumber(),interview.getInterviewDate(),interview.getInterviewTime(),interview.getInterviewPlace(),interview.getFirstInterviewResult(),interview.getSecondInterviewResult(),interview.getThiredInterviewResult());
            interviews.add(dto);
        }
        return interviews;
    }

    @Override
    public boolean placeInterview(Interview interview, Student student) throws Exception {
        return false;
    }

    @Override
    public List<Interview> searchInterviews(String id,String nic) throws Exception {
        List<Hibernate.Entity.Interview> allInterviews=interviewHIB.searchInterviews(id,nic);
        List<Interview> interviews=new ArrayList<>();
        for(Hibernate.Entity.Interview interview:allInterviews){
            //Student student=new Student(interview.getStudent().getRegNumber(),interview.getStudent().getSname(),interview.getStudent().getRdate(),interview.getStudent().getEmail(),interview.getStudent().getTelNumber(),interview.getStudent().getAddress(),interview.getStudent().getNicNumber(),interview.getStudent().getTradeOne(),interview.getStudent().getTradeTwo(),interview.getStudent().getTradeThree(),interview.getStudent().getFullRegId(),interview.getStudent().getDob(),interview.getStudent().getTrainingType());

            Interview dto=new Interview(interview.getInterviewID(),interview.getFullRegID(),interview.getNicNumber(),interview.getStdName(),interview.getEmail(),interview.getTelNumber(),interview.getInterviewDate(),interview.getInterviewTime(),interview.getInterviewPlace(),interview.getFirstInterviewResult(),interview.getSecondInterviewResult(),interview.getThiredInterviewResult());
            interviews.add(dto);
        }
        return interviews;
    }
}
