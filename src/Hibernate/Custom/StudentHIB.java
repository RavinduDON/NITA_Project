package Hibernate.Custom;

import Hibernate.Dao.CRUDdao;
import Hibernate.Entity.Student;

import java.util.List;

public interface StudentHIB extends CRUDdao<Student,String> {
    public List<Student> searchANYthing(String key) throws Exception;
}
