package Business.boIMPL;

import Business.Custom.StudentBO;
import DTO.Course;
import DTO.NextStdID;
import DTO.Student;
import Hibernate.Custom.StudentHIB;
import Hibernate.Dao.HibernateFactory;

import java.math.BigInteger;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentBOimpl implements StudentBO {

    StudentHIB studentHIB;
    public StudentBOimpl(){
        studentHIB= (StudentHIB) HibernateFactory.getHibernateFactory().getSuperDAO(HibernateFactory.HIBFactoryTypes.STUDENT);
    }
    @Override
    public boolean addStudent(Student dto) throws Exception {
        Hibernate.Entity.Student student=new Hibernate.Entity.Student(dto.getName(),new Date(),dto.getEmail(),dto.getTelNumber(),dto.getAddress(),dto.getNicNumber(),dto.getTradeOne(),dto.getTradeTwo(),dto.getTradeThree(),dto.getFullRegId(),dto.getDob(),dto.getTrainingType());
        return studentHIB.add(student);
    }

    @Override
    public boolean updateStudent(Student dto) throws Exception {
        Hibernate.Entity.Student student=new Hibernate.Entity.Student(dto.getRegNumber(),dto.getName(),new Date(),dto.getEmail(),dto.getTelNumber(),dto.getAddress(),dto.getNicNumber(),dto.getTradeOne(),dto.getTradeTwo(),dto.getTradeThree(),dto.getFullRegId(),dto.getDob(),dto.getTrainingType());
        return studentHIB.update(student);
    }

    @Override
    public boolean deletStudent(String id,String nic) throws Exception {
        return studentHIB.deleteStudent(id,nic);
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        List<Hibernate.Entity.Student> allStudents=studentHIB.getAll();
        List<Student> students=new ArrayList<>();
        for(Hibernate.Entity.Student student:allStudents){
            Student dto=new Student(student.getRegNumber(),student.getSname(),student.getRdate(),student.getEmail(),student.getTelNumber(),student.getAddress(),student.getNicNumber(),student.getTradeOne(),student.getTradeTwo(),student.getTradeThree(),student.getFullRegId(),student.getDob(),student.getTrainingType());
            students.add(dto);
        }
        return students;
    }

    @Override
    public boolean addStudentCourse(Student student) throws Exception {
        Hibernate.Entity.Student studentn=new Hibernate.Entity.Student(student.getName(),new Date(),student.getEmail(),student.getTelNumber(),student.getAddress(),student.getNicNumber(),student.getTradeOne(),student.getTradeTwo(),student.getTradeThree(),student.getFullRegId(),student.getDob(),student.getTrainingType());
        return studentHIB.addStudentCourse(studentn);
    }

    @Override
    public Student searchStudent(String id) throws Exception {
        Hibernate.Entity.Student search=studentHIB.search(id);
        Student student=new Student(search.getRegNumber(),search.getSname(),search.getRdate(),search.getEmail(),search.getTelNumber(),search.getAddress(),search.getNicNumber(),search.getTradeOne(),search.getTradeTwo(),search.getTradeThree(),search.getFullRegId(),search.getDob(),search.getTrainingType());
        return student;
    }

    @Override
    public List<Student> searchANYthing(String key) throws Exception {
        List<Hibernate.Entity.Student> allStudents=studentHIB.searchANYthing(key);
        List<Student> students=new ArrayList<>();
        for(Hibernate.Entity.Student student:allStudents){
            Student dto=new Student(student.getRegNumber(),student.getSname(),student.getRdate(),student.getEmail(),student.getTelNumber(),student.getAddress(),student.getNicNumber(),student.getTradeOne(),student.getTradeTwo(),student.getTradeThree(),student.getFullRegId(),student.getDob(),student.getTrainingType());
            students.add(dto);
        }
        return students;
    }



    @Override
    public Student getNextSTDid(String nic) throws Exception {
        Hibernate.Entity.Student student=studentHIB.getNextSTDid(nic);
        Student dto= new Student(student.getRegNumber());
        return dto;
    }

    @Override
    public List<Student> searchById(String id,String nic) throws Exception {
        List<Hibernate.Entity.Student> allStudents=studentHIB.searchById(id,nic);
        List<Student> students=new ArrayList<>();
        for(Hibernate.Entity.Student student:allStudents){
            Student dto=new Student(student.getRegNumber(),student.getSname(),student.getRdate(),student.getEmail(),student.getTelNumber(),student.getAddress(),student.getNicNumber(),student.getTradeOne(),student.getTradeTwo(),student.getTradeThree(),student.getFullRegId(),student.getDob(),student.getTrainingType());
            students.add(dto);
        }
        return students;
    }


}
