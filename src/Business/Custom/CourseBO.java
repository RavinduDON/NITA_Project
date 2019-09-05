package Business.Custom;

import Business.SuperBO;
import DTO.Course;

import java.util.List;

public interface CourseBO extends SuperBO {
    public boolean addCourse(Course dto) throws Exception;
    public boolean updateCourse(Course dto) throws Exception;
    public boolean deletCourse (String id)throws Exception;
    public List<Course> getAllCourses()throws Exception;
    public Course searchCourse(String id)throws Exception;
    public List<Course> searchANYthing(String key) throws Exception;
}
