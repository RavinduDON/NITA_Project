package Business.boIMPL;

import Business.Custom.CourseBO;
import DTO.Course;
import Hibernate.Custom.CourseHIB;
import Hibernate.Dao.HibernateFactory;

import java.util.ArrayList;
import java.util.List;

public class CourseBOimpl implements CourseBO {

    CourseHIB courseHIB;
    public CourseBOimpl(){
        courseHIB= (CourseHIB) HibernateFactory.getHibernateFactory().getSuperDAO(HibernateFactory.HIBFactoryTypes.COURSE);
    }
    @Override
    public boolean addCourse(Course dto) throws Exception {
        Hibernate.Entity.Course course =new Hibernate.Entity.Course(dto.getName(),dto.getDuration(),dto.getTrainingCenter());
        return courseHIB.add(course);
    }

    @Override
    public boolean updateCourse(Course dto) throws Exception {
        Hibernate.Entity.Course course=new Hibernate.Entity.Course(dto.getCourseID(),dto.getName(),dto.getDuration(),dto.getTrainingCenter());
        return courseHIB.update(course);
    }

    @Override
    public boolean deletCourse(String id) throws Exception {
        return courseHIB.delete(id);
    }

    @Override
    public List<Course> getAllCourses() throws Exception {
        List<Hibernate.Entity.Course> allcoCourses=courseHIB.getAll();
        List<Course> courses=new ArrayList<>();
        for(Hibernate.Entity.Course course:allcoCourses){
            Course dto=new Course(course.getCourseID(),course.getCname(),course.getDuration(),course.getTrainingCenter());
            courses.add(dto);


        }
        return courses;
    }

    @Override
    public Course searchCourse(String id) throws Exception {
        Hibernate.Entity.Course search=courseHIB.search(id);
        Course course=new Course(search.getCourseID(),search.getCname(),search.getDuration(),search.getTrainingCenter());
        return course;
    }

    @Override
    public List<Course> searchANYthing(String key) throws Exception {
        List<Hibernate.Entity.Course> allcoCourses=courseHIB.searchANYthing(key);
        List<Course> courses=new ArrayList<>();
        for(Hibernate.Entity.Course course:allcoCourses){
            Course dto=new Course(course.getCourseID(),course.getCname(),course.getDuration(),course.getTrainingCenter());
            courses.add(dto);
            System.out.println(dto.getName());
            System.out.println(dto.getTrainingCenter());
        }
        return courses;
    }
}
