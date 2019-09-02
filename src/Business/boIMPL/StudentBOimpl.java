package Business.boIMPL;

import Business.Custom.StudentBO;
import DTO.Course;
import DTO.Student;
import Hibernate.Custom.StudentHIB;
import Hibernate.Dao.HibernateFactory;

import java.util.Date;
import java.util.List;

public class StudentBOimpl implements StudentBO {

    StudentHIB studentHIB;
    public StudentBOimpl(){
        studentHIB= (StudentHIB) HibernateFactory.getHibernateFactory().getSuperDAO(HibernateFactory.HIBFactoryTypes.STUDENT);
    }
    @Override
    public boolean addStudent(Student dto) throws Exception {
        Hibernate.Entity.Student student=new Hibernate.Entity.Student(dto.getName(),new Date(),dto.getEmail(),dto.getTelNumber(),dto.getNicNumber(),dto.getTradeOne(),dto.getTradeTwo(),dto.getTradeThree(),dto.getTrainingType());
        return studentHIB.add(student);
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
