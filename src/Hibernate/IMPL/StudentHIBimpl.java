package Hibernate.IMPL;

import Hibernate.Custom.StudentHIB;
import Hibernate.Dao.HIBCUDutill;
import Hibernate.Entity.Course;
import Hibernate.Entity.Student;

import java.io.Serializable;
import java.util.List;

public class StudentHIBimpl implements StudentHIB {
    @Override
    public boolean add(Student dto) throws Exception {
        HIBCUDutill.openSession();
        Serializable id=HIBCUDutill.session.save(dto);
        if(id!=null){
            HIBCUDutill.closeSession();

            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean update(Student dto) throws Exception {
        HIBCUDutill.openSession();
        Student student=HIBCUDutill.session.get(Student.class,dto.getRegNumber());
        student.setSname(dto.getSname());
        student.setRdate(dto.getRdate());
        student.setEmail(dto.getEmail());
        student.setTelNumber(dto.getTelNumber());
        student.setAddress(dto.getAddress());
        student.setEmail(dto.getEmail());
        student.setTradeOne(dto.getTradeOne());
        student.setTradeTwo(dto.getTradeTwo());
        student.setTradeThree(dto.getTradeThree());
        student.setNicNumber(dto.getNicNumber());
        student.setTrainingType(dto.getTrainingType());
        if(student!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(String s) throws Exception {
        HIBCUDutill.openSession();
        Student student=HIBCUDutill.session.get(Student.class,Integer.parseInt(s));
        HIBCUDutill.session.delete(student);
        if(student!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Student search(String s) throws Exception {
        HIBCUDutill.openSession();
        Student student=HIBCUDutill.session.get(Student.class,Integer.parseInt(s));
        if(student!=null){
            HIBCUDutill.closeSession();
            return student;
        }else {
            return null;
        }

    }

    @Override
    public List<Student> getAll() throws Exception {
        List<Student> students;
        HIBCUDutill.openSession();
        students=HIBCUDutill.session.createNativeQuery("SELECT * FROM Student",Student.class).list();
        if(students.size()>0){
            HIBCUDutill.closeSession();

            return students;
        }else {
            return null;
        }
    }


    @Override
    public List<Student> searchANYthing(String key) throws Exception {
        List<Student> students;
        HIBCUDutill.openSession();
        students=HIBCUDutill.session.createNativeQuery("SELECT * FROM Student WHERE " +
                "regNumber like '%"+key+"%'or " +
                "sname like '%"+key+"%'or " +
                "rdate like '%"+key+"%'or " +
                "email like '%"+key+"%'or " +
                "telNumber like '%"+key+"%'or " +
                "address like '%"+key+"%'or "+
                "nicNumber like '%"+key+"%'or " +
                "tradeOne like '%"+key+"%'or " +
                "tradeTwo like '%"+key+"%'or " +
                "tradeThree like '%"+key+"%'or " +
                "fullRegId like '%"+key+"%'or " +
                "trainingType like '%"+key+"%'",Student.class).list();
        if(students.size()>0){
            HIBCUDutill.closeSession();
            return students;
        }else {
            return null;
        }
    }

    @Override
    public boolean addStudentCourse(Student student) throws Exception {

        String tradeOne=student.getTradeOne();
        String tradeTwo=student.getTradeTwo();
        String tradeThree=student.getTradeThree();
        List<Course> courses;
        courses=HIBCUDutill.session.createNativeQuery("SELECT * FROM Course WHERE " +
                "cname like '%"+tradeOne+"%'or " +
                "cname like '%"+tradeTwo+"%'or " +
                "cname like '%"+tradeThree+"%' ",Course.class).list();
        HIBCUDutill.openSession();
//        student.setCourses(courses);
        Serializable id=HIBCUDutill.session.save(student);
        if(id!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }
    }



    @Override
    public Student getNextSTDid(String nic) throws Exception {
       HIBCUDutill.openSession();
//       Object result=HIBCUDutill.session.createSQLQuery("SELECT student_seq.next_val");
        Student student= (Student) HIBCUDutill.session.createNativeQuery("SELECT regNumber from Student where nicNumber like'%"+nic+"%'",Student.class);
        return student;

    }
}
