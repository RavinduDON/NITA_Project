package Business.boIMPL;

import Business.Custom.StudentBO;
import DTO.Course;
import DTO.Student;

import java.util.List;

public class StudentBOimpl implements StudentBO {
    @Override
    public boolean addStudent(Student dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateStudent(Student dto) throws Exception {
        return false;
    }

    @Override
    public boolean deletStudent(String id) throws Exception {
        return false;
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        return null;
    }

    @Override
    public boolean addStudentCourse(Student student, Course course) throws Exception {
        return false;
    }

    @Override
    public Student searchStudent(String id) throws Exception {
        return null;
    }

    @Override
    public List<Student> searchANYthing(String key) throws Exception {
        return null;
    }
}
