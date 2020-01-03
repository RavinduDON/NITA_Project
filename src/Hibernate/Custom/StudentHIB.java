package Hibernate.Custom;

import Hibernate.Dao.CRUDdao;
import Hibernate.Entity.Course;
import Hibernate.Entity.NextStdID;
import Hibernate.Entity.Student;

import java.util.List;

public interface StudentHIB extends CRUDdao<Student,String> {
    public List<Student> searchANYthing(String key) throws Exception;
    public boolean deleteStudent(String id,String nic)throws Exception;
    public boolean addStudentCourse(Student student)throws Exception;
    public Student getNextSTDid(String nic)throws Exception;
    public List<Student> searchById(String id,String nic) throws Exception;
}
