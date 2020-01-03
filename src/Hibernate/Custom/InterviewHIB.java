package Hibernate.Custom;

import Hibernate.Dao.CRUDdao;
import Hibernate.Entity.Interview;
import Hibernate.Entity.Student;

import java.util.List;

public interface InterviewHIB extends CRUDdao<Interview,String> {
    public boolean placeInterview(Interview interview,Student student) throws Exception;
    public List<Interview> searchANYthing(String key) throws Exception;
    public List<Interview> searchInterviews(String id,String nic) throws Exception;
}
