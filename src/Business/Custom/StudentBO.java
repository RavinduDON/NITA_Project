package Business.Custom;

import Business.SuperBO;
import DTO.Course;
import DTO.NextStdID;
import DTO.Student;

import java.util.List;

public interface StudentBO extends SuperBO {
    public boolean addStudent(Student dto) throws Exception;
    public boolean updateStudent(Student dto) throws Exception;
    public boolean deletStudent (String id)throws Exception;
    public List<Student> getAllStudents()throws Exception;
    public boolean addStudentCourse(Student student)throws Exception;
    public Student searchStudent(String id)throws Exception;
    public List<Student> searchANYthing(String key) throws Exception;
    public Long getNextSTDid() throws Exception;
}
