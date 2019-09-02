package Business.Custom;

import Business.SuperBO;
import DTO.Course;
import DTO.Student;

import java.util.List;

public interface StudentBO extends SuperBO {
    public boolean addStudent(Student dto) throws Exception;
    public boolean updateStudent(Student dto) throws Exception;
    public boolean deletStudent (String id)throws Exception;
    public List<Student> getAllStudents()throws Exception;
    public boolean addStudentCourse(Student student, Course course)throws Exception;
    public Student searchStudent(String id)throws Exception;
    public List<Student> searchANYthing(String key) throws Exception;
}
