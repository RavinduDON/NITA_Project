package Hibernate.IMPL;

import Hibernate.Custom.StudentHIB;
import Hibernate.Dao.HIBCUDutill;
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
        student.setName(dto.getName());
        student.setDate(dto.getDate());
        student.setEmail(dto.getEmail());
        student.setTelNumber(dto.getTelNumber());
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
        return false;
    }

    @Override
    public Student search(String s) throws Exception {
        return null;
    }

    @Override
    public List<Student> getAll() throws Exception {
        return null;
    }
}
