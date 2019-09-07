package Hibernate.IMPL;

import Hibernate.Custom.CourseHIB;
import Hibernate.Dao.HIBCUDutill;
import Hibernate.Entity.Course;
import org.hibernate.query.NativeQuery;

import java.io.Serializable;
import java.util.List;

public class CourseHIBimpl implements CourseHIB {

    @Override
    public boolean add(Course dto) throws Exception {
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
    public boolean update(Course dto) throws Exception {
        HIBCUDutill.openSession();
        Course course=HIBCUDutill.session.load(Course.class,dto.getCourseID());
        System.out.println(course.getCourseID());
        course.setCname(dto.getCname());
        course.setDuration(dto.getDuration());
        course.setTrainingCenter(dto.getTrainingCenter());



        if(course!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(String s) throws Exception {
        HIBCUDutill.openSession();
        Course course=HIBCUDutill.session.get(Course.class,s);
        HIBCUDutill.session.delete(course);
        if(course!=null){
            HIBCUDutill.closeSession();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Course search(String s) throws Exception {
        HIBCUDutill.openSession();
        Course course=HIBCUDutill.session.get(Course.class,Integer.parseInt(s));

        if(course!=null){

            HIBCUDutill.closeSession();
            return course;
        }else {
            return null;
        }
    }

    @Override
    public List<Course> getAll() throws Exception {
        List<Course> courses;
        HIBCUDutill.openSession();
        courses=HIBCUDutill.session.createNativeQuery("SELECT * FROM Course",Course.class).list();
        if(courses.size()>0){
            HIBCUDutill.closeSession();
            return courses;
        }else {
            return null;
        }
    }

    @Override
    public List<Course> searchANYthing(String key) throws Exception {
        List<Course> courses;
        HIBCUDutill.openSession();
        courses=HIBCUDutill.session.createNativeQuery("SELECT * FROM Course WHERE " +
                        "courseID like '%"+key+"%'or " +
                        "cname like '%"+key+"%'or " +
                        "duration like '%"+key+"%'or " +
                "trainingCenter like '%"+key+"%'",Course.class).list();
        if(courses.size()>0){
            HIBCUDutill.closeSession();
            return courses;
        }else {
            return null;
        }
    }
}
