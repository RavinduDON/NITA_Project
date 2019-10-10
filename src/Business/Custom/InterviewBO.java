package Business.Custom;

import DTO.Interview;
import DTO.Student;

import java.util.List;

public interface InterviewBO {
    public boolean addInterview(Interview dto) throws Exception;
    public boolean updateInterview(Interview dto) throws Exception;
    public boolean deletInterview (String id)throws Exception;
    public List<Interview> getAllInterviews()throws Exception;
    public Interview searchInterview(String id)throws Exception;
    public List<Interview> searchANYthing(String key) throws Exception;
    public boolean placeInterview(Interview interview, Student student) throws Exception;
    
}
