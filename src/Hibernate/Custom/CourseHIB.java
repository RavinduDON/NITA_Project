package Hibernate.Custom;

import Hibernate.Dao.CRUDdao;
import Hibernate.Entity.Course;

import java.util.List;

public interface CourseHIB extends CRUDdao<Course,String> {
    public List<Course> searchANYthing(String key) throws Exception;
}
